package com.ketech.bq.ketech.service;

import com.ketech.bq.ketech.annotation.LogWrite;
import com.ketech.bq.ketech.bean.ParamsBean;
import com.ketech.bq.ketech.common.DescribeException;
import com.ketech.bq.ketech.common.ExceptionEnum;
import com.ketech.bq.ketech.entity.DmWpEntity;
import com.ketech.bq.ketech.entity.DmWpEntityExample;
import com.ketech.bq.ketech.mapper.DmWpEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/******************
 * @描述：
 * @createBy:lailai
 * @data:2019/6/28 14:17
 */
//@Service("DmWpService")
@Service
public class DmWpService  extends AbstractService<List<DmWpEntity>,DmWpEntityExample> {

    private static  List<String> phone_ins = new ArrayList<>();

    private static List<String> bank_ins = new  ArrayList<>();


    static {
        phone_ins.add("11");
        phone_ins.add("12");
        bank_ins.add("10");
        bank_ins.add("14");
    }

    @Autowired
    private DmWpEntityMapper dmWpEntityMapper;


    @LogWrite( operationType="query" , operationContent="物品主题查询",isStoreQuery=false)
    public List<DmWpEntity> mergeParams(ParamsBean params,String type){
        List<DmWpEntityExample> params_list = new ArrayList<>();
        DmWpEntityExample example = new DmWpEntityExample();
        DmWpEntityExample.Criteria criteria = example.createCriteria();

        if(type.equals("phonenumber")){ //查手机
            if(params.getQuerytype().equals("1")){ //通过手机号码查
                criteria.andSawpdmIn(phone_ins); // 11 12
//                criteria.andWpmcEqualTo(params.getQueryparams());
                criteria.andWpmcLike("%" + params.getQueryparams() +"%");
            }else{ //可拓展，如身份证
                throw new DescribeException(ExceptionEnum.params_unknow);
            }
        }else{ // 查银行卡
            if(params.getQuerytype().equals("1")){ //通过银行卡
                criteria.andSawpdmIn(bank_ins); // 11 12
                criteria.andWpmcLike("%" + params.getQueryparams() +"%");
            }else{ //可拓展，如身份证
                throw new DescribeException(ExceptionEnum.params_unknow);
            }
        }
        params_list.add(example);
        List<DmWpEntity> result = new ArrayList<DmWpEntity>() ;
        //多个参数查询结果
        List<List<DmWpEntity>> lists = super.mergeParams(params_list);
        for(List<DmWpEntity> bmlist :lists){
            result.addAll(bmlist);
        }
        return result ;
    }



    @Override
    protected List<DmWpEntity> doQuery(DmWpEntityExample params) {
        return  dmWpEntityMapper.selectByExample(params);
    }

}
