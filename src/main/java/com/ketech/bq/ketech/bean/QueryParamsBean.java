package com.ketech.bq.ketech.bean;

/******************
 * @描述： 查询条件bean
 * @createBy:lailai
 * @data:2019/7/3 9:18
 */

import lombok.Data;

@Data
public class QueryParamsBean {

    private String type;

    private ParamsBean params;




    // 页码
    private Integer pagenum;
    // 页码大小
    private Integer pagesize;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ParamsBean getParams() {
        return params;
    }

    public void setParams(ParamsBean params) {
        this.params = params;
    }
}
