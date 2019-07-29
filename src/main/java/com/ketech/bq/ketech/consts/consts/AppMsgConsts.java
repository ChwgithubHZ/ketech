package com.ketech.bq.ketech.consts.consts;

/**
 * Created with IntelliJ IDEA.
 * Author: @hw
 * Create:  2019-04-24 09:33
 * Description:
 */
public class AppMsgConsts {
    public static final String SYSTEM_ERROR = "服务繁忙，请稍后重试";
    public static final String ERROR_404 = "Not Found.";
    public static final String ERROR_400 = "Bad Request.";
    public static final String ERROR_403 = "Forbidden.";
    public static final String ERROR_500 = "Internal Server Error.";
    public static final String PARAMETERS_ERROR = "请求参数错误";
    // 服务器加密响应内容失败
    public static final String PACKAGE_NAME_ILLEGAL = "你正在使用的App为非官方发布版，请重新下载并安装。";
    public static final String ACCOUNT_AUTH_TIMEOUT = "用户登录超时，请重新登入";
    public static final String USER_PERMANENT_BLOCKED = "账号被禁用，请联系工作人员";

    public static final String PHONE_NUMBER_ILLEGAL = "请填写正确的手机号";

    public static final String ERROR_SMSCODE = "验证码错误";
    public static final String ERROR_AlREADY_ENROLL = "用户已注册";
    public static final String ERROR_LOGIN_DISABLE = "账号已禁用";
    public static final String ERROR_LOGISTICS_ORDER_NOT_EXIST = "订单不存在";
    public static final String ERROR_LOGISTICS_ORDER_NOT_FINISH = "存在进行中的订单";
    public static final String ERROR_UNKNOWN_PAY_TYPE = "不支持的支付类型";
    public static final String ERROR_ALI_PAY_SIGN = "支付失败,请重试";
    public static final String ERROR_ORDER_COMMENT = "该订单已评论,无须重复评论";
    public static final String ERROR_INVOICE_DETAIL_NOT_EXIST = "发票不存在";
}
