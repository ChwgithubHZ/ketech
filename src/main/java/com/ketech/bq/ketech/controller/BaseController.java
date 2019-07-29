package com.ketech.bq.ketech.controller;

import com.alibaba.fastjson.JSONObject;
import com.ketech.bq.ketech.bean.QueryResultBean;

/******************
 * @描述： controller 基类
 * @createBy:lailai
 * @data:2019/6/26 16:34
 */
public abstract class BaseController {

    private static JSONObject result = new JSONObject();

    public  int num = 1;

    /************
     * 查询数据统一返回
     * @param success
     * @param total
     * @param data
     * @return
     */
    protected  String encodeJsonResult(boolean success,int total,Object data){
        QueryResultBean queryResultBean  = new QueryResultBean();
        queryResultBean.setSuccess(success);
        queryResultBean.setTotal(total);
        queryResultBean.setData(data);
        result.put("success",success);
//        result.put("total",total);
        result.put("data",data);
//        JSONObject json = JSONObject.fromObject(queryResultBean);
//        return result.toString();
        return result.toJSONStringWithDateFormat(result,"yyyy-MM-dd  HH:mm:ss");
    }


}
