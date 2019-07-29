package com.ketech.bq.ketech.bean;

import javax.validation.constraints.NotNull;

/******************
 * @描述： 查询条件bean
 * @createBy:lailai
 * @data:2019/6/26 16:47
 */
public class QueryServiceBean {
    @NotNull(message = "未知的请求服务，请填写正确的服务名称")
    private String type;

    @NotNull(message = "查询参数不能为空")
    private String params;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
}
