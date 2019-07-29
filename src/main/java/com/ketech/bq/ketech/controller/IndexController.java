package com.ketech.bq.ketech.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ketech.bq.ketech.bean.*;
import com.ketech.bq.ketech.common.DescribeException;
import com.ketech.bq.ketech.common.ExceptionEnum;
import com.ketech.bq.ketech.common.RelationType;
import com.ketech.bq.ketech.common.SystemAopAspect;
import com.ketech.bq.ketech.dataconfig.ResultJsonUtil;
import com.ketech.bq.ketech.entity.*;
import com.ketech.bq.ketech.service.*;

import org.neo4j.driver.internal.InternalNode;
import org.neo4j.driver.internal.InternalPath;
import org.neo4j.driver.internal.InternalRelationship;
import org.neo4j.driver.v1.*;
import org.neo4j.graphdb.*;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import javax.validation.Valid;
import java.io.File;
import java.util.*;

import static org.neo4j.driver.v1.Values.parameters;

/******************
 * @描述：
 * @createBy:
 * @data:2019/6/26 16:27
 */
@RestController
@RequestMapping("service")
public class IndexController extends BaseController {

    private final static Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private DmBqService service;

    @Autowired
    private DmWpService dmWpService;

    @Autowired
    private DmTxhmService dmTxhmService;

//    @Autowired
//    private DmHdService dmHdService;

    @Value("${spring.datasource.neofj.url}")
    private String url;
    @Value("${spring.datasource.neofj.username}")
    private String username;
    @Value("${spring.datasource.neofj.password}")
    private String password;

    private int mynum = 1;

    /*****
     * 查询vos数据
     * 使用@Valid对参数进行检验
     * @param record
     * @return
     */
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Object queryVos(@Valid @RequestBody String record) {
//        try{
        LOGGER.info(record);
        QueryParamsBean queryParamsBean = JSONObject.parseObject(record, QueryParamsBean.class);
        String service_type = queryParamsBean.getType();
        if (service_type != null) {
            switch (service_type) {
                case "ketech.service.phonenumber": // 号码
                    num += 1; // num = num + 1
                    List<DmWpEntity> wp_list = dmWpService.mergeParams(queryParamsBean.getParams(), "phonenumber");
                    List<DmTxhmEntity> txhm_list = dmTxhmService.mergeParams(queryParamsBean.getParams()); //手机号码标签
                    MegerDataBean megerDataBean = new MegerDataBean();
                    megerDataBean.setWpData(wp_list);
                    megerDataBean.setTxhmData(txhm_list);
                    return encodeJsonResult(true, 0, megerDataBean);

                case "ketech.service.banknumber": //  银行
                    List<DmBqBean> list = service.mergeParams(queryParamsBean.getParams()); //银行卡标签
                    List<DmWpEntity> bank_wp = dmWpService.mergeParams(queryParamsBean.getParams(), "banknumber"); //银行卡物品
                    MegerDataBean bank_megerDataBean = new MegerDataBean();
                    bank_megerDataBean.setDmBqData(list);
                    bank_megerDataBean.setWpData(bank_wp);
                    return encodeJsonResult(true, 0, bank_megerDataBean);

                default: //可选
                    throw new DescribeException(ExceptionEnum.service_unknow);
            }
        } else {
            throw new DescribeException(ExceptionEnum.service_unknow);
        }
//        }catch (Exception e){
//            e.printStackTrace();
//            throw new DescribeException(ExceptionEnum.valid_token);
//        }
    }


    private Driver createDrive() {
        return GraphDatabase.driver(url, AuthTokens.basic(username, password));


    }


    /**
     * 通过两个实体进行对应的关系查询，例如查询QQ号与手机号之间的关系
     * @param params
     * @return
     */
    @RequestMapping(value = "/query/neofj", method = RequestMethod.POST)
    public String queryNeofj(@Valid @RequestBody String params) {
        String results = "";
        QueryParamsBean param = JSONObject.parseObject(params, QueryParamsBean.class);
        Driver driver = createDrive();
        Session session = driver.session();
        //开始标签
        String startLabels = param.getParams().getStartLabels();
        //结束标签
        String endLabels = param.getParams().getEndLabels();
        //属性类型
        String attributeType = param.getParams().getAttributeType();
        //关系类型
        String relationType = param.getParams().getRelationType();
        //属性值
        String attributeValue = param.getParams().getAttributeValue();

        //当前neo4j所有标签
        String[] allLabel={"dm_st_asj","dm_st_wp","dm_st_ry"};
        int startcode=0;
        int endcode=0;
        for (String label:allLabel){
            if(startLabels.equals(label)){
                startcode+=1;
            }
            if(endLabels.equals(label)){
                endcode+=1;
            }

        }
        if(startcode==0||endcode==0){
            return ResultJsonUtil.buildExceptionJson("您输入的标签有误！");
        }


        StatementResult result;
        try {


            //MATCH (start_node:dm_st_asj{asjbh:"01"})-[r:asj]->(end_node:dm_st_wp) RETURN start_node,r,end_node
            String math = "MATCH (start_node:" + startLabels + "{" + attributeType + ":\"" + attributeValue + "\"})-[r:" + relationType + "]->(end_node:" + endLabels + ") RETURN start_node,r,end_node";
//        String math ="MATCH (start_node:"+startLabels+"attributeType:"+relationValue+")-[r:"+relationType+"]->(end_node:"+endLabels+") RETURN start_node,r,end_node";
            LOGGER.info(math);
            result = session.run(math);
            List<NeofjDatabean> allList = new ArrayList<>();
            MegerDataBean neoAllData = new MegerDataBean();
            NeofjDatabean neoData = new NeofjDatabean();

            while (result.hasNext()) {
                Record records = result.next();

                switch (startLabels) {
                    case "dm_st_asj":
                        neoData.setAsjNode(caseEntity(records, "start_node"));
                        break;
                    case "dm_st_wp":
                        neoData.setWpNode(objectEntity(records, "start_node"));
                        break;
                    case "dm_st_ry":
                        neoData.setPeopleNode(peopleEntity(records, "start_node"));
                        break;

                }


                switch (endLabels) {
                    case "dm_st_asj":

                        neoData.setAsjNodeEnd(caseEntity(records, "end_node"));
                        break;
                    case "dm_st_wp":

                        neoData.setWpNodeEnd(objectEntity(records, "end_node"));
                        break;
                    case "dm_st_ry":

                        neoData.setPeopleNodeEnd(peopleEntity(records, "end_node"));
                        break;
                }
                neoData.setRelationData(relation(records));
                allList.add(neoData);

            }
            neoAllData.setNeofjData(allList);
            if (allList.size() == 0) {

                results = ResultJsonUtil.buildSuccessMsgJson("Sorry ！No data was found！");
            } else {
                results = ResultJsonUtil.buildSuccessDataJson(neoAllData);
            }

            // 关闭连接
            session.close();
            driver.close();
        } catch (Exception e) {
            results = ResultJsonUtil.buildErrorJson(e.toString());
        }
        return results;

    }

    /**
     * 通过一个实体编号进行多层关系的查询，例如查询手机号相关的N层关系与实体
     * @param params
     * @return
     */
    @RequestMapping(value = "/query/neofjByPoint", method = RequestMethod.POST)
    public String queryNeofjByPoint(@Valid @RequestBody String params) {
        String results = "";
        QueryParamsBean param = JSONObject.parseObject(params, QueryParamsBean.class);
        JSONObject jsonObject = new JSONObject();
        Driver driver = createDrive();
        StatementResult result;
        Session session = driver.session();

        //开始标签
        String startLabels = param.getParams().getStartLabels();
        //属性类型
        String attributeType = param.getParams().getAttributeType();
        //关系层级
        String layer = param.getParams().getLayer();
        //属性值
        String attributeValue = param.getParams().getAttributeValue();
        try {
            if(StringUtils.isEmpty(startLabels) || StringUtils.isEmpty(attributeType) || StringUtils.isEmpty(layer) || StringUtils.isEmpty(attributeValue)){
                return ResultJsonUtil.buildErrorJson(500,"参数错误");
            }

            String math = "match (start_node:" + startLabels + "{" + attributeType + ":'" + attributeValue + "'}) -[r*1.." + layer + "]- (end_node) return start_node,r,end_node";
            LOGGER.info(math);
            result = session.run(math);
            Map<String, Object> nodedatas = new HashMap<>();
            JSONArray lineJsonArray = new JSONArray();
            JSONObject lineJsonObject = new JSONObject();

            while (result.hasNext()) {
                Record record = result.next();
                Map<String, Object> date = record.asMap();
                for (String key : date.keySet()) {
                    Object object = date.get(key);
                    if("start_node".equals(key) || "end_node".equals(key)){
                        InternalNode data = (InternalNode) object;// 强制转换
                        long nodeid = data.id();
                        Iterator<String> labels = data.labels().iterator();
                        String label = "";
                        if( data.labels().size() == 1 ){
                            while(labels.hasNext()) {
                                label = labels.next();
                            }
                        }

                        Map<String, Object> data1 = data.asMap();// 添加节点的属性
                        Object obj = null;
                        switch (label) {
                            case "dm_st_asj":
                                obj = caseEntity("dm_st_asj",data1);
                                break;
                            case "dm_st_wp":
                                obj = objectEntity("dm_st_wp",data1);
                                break;
                            case "dm_st_ry":
                                obj = peopleEntity("dm_st_ry",data1);
                                break;
                        }
                        if( null == nodedatas.get(Long.toString(nodeid)) && null != obj){
                            nodedatas.put(Long.toString(nodeid),obj);
                        }
                    }else{
                        List<InternalRelationship> relationships = (List<InternalRelationship>) object;// 强制转换
                        if(!relationships.isEmpty()){
                            for(InternalRelationship relationship:relationships) {
                                lineJsonObject = lineToJson(relationship);
                                lineJsonArray.add(lineJsonObject);
                            }
                        }else{
                            continue;
                        }
                    }

                }
            }

            if (nodedatas.size() == 0) {
                results = ResultJsonUtil.buildSuccessMsgJson("未查询到结果！");
            } else {
                jsonObject.put("nodes",nodedatas);
                jsonObject.put("links",lineJsonArray);
                results = ResultJsonUtil.buildSuccessDataJson(jsonObject,"success");
            }

            // 关闭连接
            session.close();
            driver.close();
        } catch (Exception e) {
            results = ResultJsonUtil.buildErrorJson(505,e.toString());
        }
        return results;

    }

    /**
     * Louzh新增 关系转成json
     * @param relationship
     * @return
     */
    public JSONObject lineToJson(InternalRelationship relationship){
        JSONObject lineJsonObject = new JSONObject();
        Map<String, Object> data2 = relationship.asMap();// 添加关系的属性  //
        for (String key1 : data2.keySet()) {
            switch (key1){
                case "gxms":
                    lineJsonObject.put("gxms", data2.get(key1));
                    lineJsonObject.put("gxms_cn", RelationType.getRelationType(data2.get(key1).toString()));
                    break;
                case "gxbq":
                    lineJsonObject.put("gxbq", data2.get(key1));
                    break;
                case "ly":
                    lineJsonObject.put("ly", data2.get(key1));
                    break;
                case "stb1":
                    lineJsonObject.put("stb1", data2.get(key1));
                    break;
                case "stb2":
                    lineJsonObject.put("stb2", data2.get(key1));
                    break;
                case "s_tb":
                    lineJsonObject.put("s_tb", data2.get(key1));
                    break;
                case "createdtime":
                    lineJsonObject.put("createdtime", data2.get(key1));
                    break;
            }
        }
        long source = relationship.startNodeId();// 起始节点id
        long target = relationship.endNodeId();// 结束节点Id

        lineJsonObject.put("source", "'"+source+"'");
        lineJsonObject.put("target", "'"+target+"'");
        return lineJsonObject;
    }
    /**
     * ID	ID	string
     * ASJBH	案事件编号	string
     * ASJLX	案事件类型	string
     * LASJ	立案时间	string
     * LADW	立案单位	string
     * ZBR	主办人	string
     * ZBDW	主办单位	string
     * ZBRLXDH	主办人联系电话	string
     * SJLY	数据来源	string
     * LYB	来源表	string
     * LYB_ID	来源表ID	string
     * BQ	标签	string
     * GXSJ	更新时间	timestamp
     * CREATEDTIME	实体创建时间	timestamp
     */

    private NoefjCaseEntity caseEntity(Record records, String nodeType) {

        NoefjCaseEntity cases = new NoefjCaseEntity();
        cases.setId(records.get(nodeType).get("id").asString());
        cases.setAsjbh(records.get(nodeType).get("asjbh").asString());
        cases.setAsjlx(records.get(nodeType).get("asjlx").asString());
        cases.setLasj(records.get(nodeType).get("ladw").asString());
        cases.setLadw(records.get(nodeType).get("zbr").asString());
        cases.setZbrlxdh(records.get(nodeType).get("zbrlxdh").asString());
        cases.setSjly(records.get(nodeType).get("sjly").asString());
        cases.setLyb(records.get(nodeType).get("lyb").asString());
        cases.setLyb_id(records.get(nodeType).get("lyb_id").asString());
        cases.setBq(records.get(nodeType).get("bq").asString());
        cases.setGxsj(records.get(nodeType).get("gxsj").asString());
        cases.setCreatedtime(records.get(nodeType).get("createdtime").asString());
        return cases;
    }

    private NoefjCaseEntity caseEntity(String type,Map<String, Object> data) {

        NoefjCaseEntity cases = new NoefjCaseEntity();
        cases.setLabelType(type);
        cases.setId(data.get("id").toString());
        cases.setAsjbh(data.get("asjbh").toString());
        cases.setAsjlx(data.get("asjlx").toString());
        cases.setLasj(data.get("ladw").toString());
        cases.setLadw(data.get("zbr").toString());
        cases.setZbrlxdh(data.get("zbrlxdh").toString());
        cases.setSjly(data.get("sjly").toString());
        cases.setLyb(data.get("lyb").toString());
        cases.setLyb_id(data.get("lyb_id").toString());
        cases.setBq(data.get("bq").toString());
        cases.setGxsj(data.get("gxsj").toString());
        cases.setCreatedtime(data.get("createdtime").toString());
        return cases;
    }
    /**
     * ID	ID	string
     * WPBH	物品编号	string
     * WPLX	物品类型	string
     * WPJS	物品角色	string
     * GSD	归属地	string
     * WPZT	物品状态	string
     * SJLY	数据来源	string
     * LYB	来源表	string
     * LYB_ID	来源表ID	string
     * BQ	标签	string
     * GXSJ	更新时间	timestamp
     * CREATEDTIME	实体创建时间	timestamp
     */
    private NoefjObjectEntity objectEntity(Record records, String nodeType) {
        NoefjObjectEntity object = new NoefjObjectEntity();
        object.setId(records.get(nodeType).get("id").asString());
        object.setWpbh(records.get(nodeType).get("wpbh").asString());
        object.setWplx(records.get(nodeType).get("wplx").asString());
        object.setWpjs(records.get(nodeType).get("wpjs").asString());
        object.setGsd(records.get(nodeType).get("gsd").asString());
        object.setWpzt(records.get(nodeType).get("wpzt").asString());
        object.setSjly(records.get(nodeType).get("sjly").asString());
        object.setLyb(records.get(nodeType).get("lyb").asString());
        object.setLyb_id(records.get(nodeType).get("lyb_id").asString());
        object.setBq(records.get(nodeType).get("bq").asString());
        object.setGxsj(records.get(nodeType).get("gxsj").asString());
        object.setCreatedtime(records.get(nodeType).get("createdtime").asString());
        return object;
    }

    private NoefjObjectEntity objectEntity(String type, Map<String, Object> data) {
        NoefjObjectEntity object = new NoefjObjectEntity();
        object.setLabelType(type);
        object.setId(data.get("id").toString());
        object.setWpbh(data.get("wpbh").toString());
        object.setWplx(data.get("wplx").toString());
        object.setWpjs(data.get("wpjs").toString());
        object.setGsd(data.get("gsd").toString());
        object.setWpzt(data.get("wpzt").toString());
        object.setSjly(data.get("sjly").toString());
        object.setLyb(data.get("lyb").toString());
        object.setLyb_id(data.get("lyb_id").toString());
        object.setBq(data.get("bq").toString());
        object.setGxsj(data.get("gxsj").toString());
        object.setCreatedtime(data.get("createdtime").toString());
        return object;
    }
    /**
     * private String id;
     * //实体ID1
     * private String stid1;
     * //实体表1
     * private String stb1;
     * //角色1
     * private String js1;
     * //实体ID2
     * private String stid2;
     * //实体表2
     * private String stb2;
     * //角色2
     * private String js2;
     * //来源表
     * private String s_tb;
     * //关系描述
     * private String gxms;
     * //更新时间
     * private String gxsj;
     * //关系标签
     * private String gxbq;
     * //来源
     * private String ly;
     * //置信度
     * private String zxd;
     * //表创建时间
     * private String createdtime;
     *
     * @param records
     * @return
     */
    private NoefjRelation relation(Record records) {

        NoefjRelation relation = new NoefjRelation();
        relation.setId(records.get("r").get("id").asString());
        relation.setStid1(records.get("r").get("stid1").asString());
        relation.setStb1(records.get("r").get("stb1").asString());
        relation.setJs1(records.get("r").get("js1").asString());
        relation.setStid2(records.get("r").get("stid2").asString());
        relation.setStb2(records.get("r").get("stb2").asString());
        relation.setJs2(records.get("r").get("js2").asString());
        relation.setS_tb(records.get("r").get("s_tb").asString());
        relation.setGxms(records.get("r").get("gxms").asString());
        relation.setGxsj(records.get("r").get("gxsj").asString());
        relation.setGxbq(records.get("r").get("gxbq").asString());
        relation.setLy(records.get("r").get("ly").asString());
        relation.setZxd(records.get("r").get("zxd").asString());
        relation.setCreatedtime(records.get("r").get("createdtime").asString());

        return relation;

    }

    /**
     * //ID
     * <p>
     * private String id;
     * //人员类别
     * private String rylb;
     * <p>
     * //姓名
     * private String xm;
     * //证件类型
     * private String zjlx;
     * //证件号码
     * private String zjhm;
     * //性别
     * private String xb;
     * //职业
     * private String zy;
     * //数据来源
     * private String sjly;
     * //来源表
     * private String lyb;
     * //来源表ID
     * private String lyb_id;
     * //标签
     * private String bq;
     * //更新时间
     * private String gxsj;
     * <p>
     * //实体创建时间
     * private String createdtime;
     *
     * @param data
     * @return
     */


    private NoefjPeopleEntity peopleEntity(String type, Map<String, Object> data) {
        NoefjPeopleEntity peopleEntity = new NoefjPeopleEntity();
        peopleEntity.setLabelType(type);
        peopleEntity.setId(data.get("id").toString());
        peopleEntity.setRylb(data.get("rylb").toString());
        peopleEntity.setXm(data.get("xm").toString());
        peopleEntity.setZjlx(data.get("zjlx").toString());
        peopleEntity.setZjhm(data.get("zjhm").toString());
        peopleEntity.setXb(data.get("xb").toString());
        peopleEntity.setZy(data.get("zy").toString());
        peopleEntity.setSjly(data.get("sjly").toString());
        peopleEntity.setLyb(data.get("lyb").toString());
        peopleEntity.setLyb_id(data.get("lyb_id").toString());
        peopleEntity.setBq(data.get("bq").toString());
        peopleEntity.setGxsj(data.get("gxsj").toString());
        peopleEntity.setCreatedtime(data.get("createdtime").toString());
        return peopleEntity;
    }

    private NoefjPeopleEntity peopleEntity(Record records, String nodeType) {
        NoefjPeopleEntity peopleEntity = new NoefjPeopleEntity();
        peopleEntity.setId(records.get(nodeType).get("id").asString());
        peopleEntity.setRylb(records.get(nodeType).get("rylb").asString());
        peopleEntity.setXm(records.get(nodeType).get("xm").asString());
        peopleEntity.setZjlx(records.get(nodeType).get("zjlx").asString());
        peopleEntity.setZjhm(records.get(nodeType).get("zjhm").asString());
        peopleEntity.setXb(records.get(nodeType).get("xb").asString());
        peopleEntity.setZy(records.get(nodeType).get("zy").asString());
        peopleEntity.setSjly(records.get(nodeType).get("sjly").asString());
        peopleEntity.setLyb(records.get(nodeType).get("lyb").asString());
        peopleEntity.setLyb_id(records.get(nodeType).get("lyb_id").asString());
        peopleEntity.setBq(records.get(nodeType).get("bq").asString());
        peopleEntity.setGxsj(records.get(nodeType).get("gxsj").asString());
        peopleEntity.setCreatedtime(records.get(nodeType).get("createdtime").asString());
        return peopleEntity;
    }

    @Autowired
    private DataSource dataSource;


    @RequestMapping(value = "/heart")
    public Object heart() {
        DruidDataSource dataSoudrce = (DruidDataSource) dataSource;

        System.out.println(dataSoudrce.getRawJdbcUrl());
        return encodeJsonResult(true, 0, "o yeah , I'm  fine ");
    }
}
