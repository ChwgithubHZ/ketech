package com.ketech.bq.ketech.common;

/**************
 * 系统异常 枚举类
 */
public enum ExceptionEnum {

    unknow_error("error-001","未知错误"),
    user_not_find("error-002","用户不存在"),
    valid_token("error-003","对不起，token验证失败，请携带正确的token值"),
    no_token_value("error-004","token值为空"),
    token_has_expired("error-005","token已失效"),
    valid_params_failure("error-006","请求参数解析失败"),
    pool_params_isnull("error-007","查询线程获取参数失败"),
    pool_unknow_error("error-008","线程池创建任务队列遇到未知错误"),
    pool_query_error("error-009","线程池查询数据遇到未知错误"),
    service_unknow("error-010","请求服务名称解析失败"),
    json_unknow("error-011","json解析失败，请检查参数格式"),
    params_unknow("error-011","检查请求的服务是否缺失查询参数"),
    sql_autowrid_error("error-012","别打坏主意，sql注入吗？"),
    ;
    private String code;

    private String msg;

    ExceptionEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
