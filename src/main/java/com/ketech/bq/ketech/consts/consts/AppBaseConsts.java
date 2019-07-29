package com.ketech.bq.ketech.consts.consts;

/**
 * Created with IntelliJ IDEA.
 * Author: @hw
 * Create:  2019-04-24 09:24
 * Description:
 */
public interface AppBaseConsts {
    String CHARSET = "UTF-8";
    String FMT_yyyy_MM_dd = "yyyy-MM-dd";
    String FMT_yyyy_MM_dd_HH_mm = "yyyy-MM-dd HH:mm";
    String FMT_yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";
    String FMT_MM_dd_HH_mm = "MM-dd HH:mm";
    String FMT_yyyy_MM = "yyyy-MM";
    String FMT_MM_dd = "MM-dd";
    String FMT_yyyyMMddHHmmss = "yyyyMMddHHmmss";
    // 返回的JSON，code==200表示成功
    int JSON_INFO_SUCCESS_CODE = 200;
    // 错误JSON的默认的code值（最常用的值）
    int JSON_INFO_ERROR_CODE_DEFAULT = 0;
    // 错误JSON的code值：发生异常时
    int JSON_INFO_ERROR_CODE_EXCEPTION = 500;
    // 错误JSON的code值：非法请求时
    int JSON_INFO_ERROR_CODE_ILLEGAL_REQUEST = 400;
    // 错误JSON的code值：无法确认用户正常登录了（用户不存在/用户被封号/密钥改变/用户请求被伪造等错误），客户端检查到这种状态，应该主动退出登录
    int JSON_INFO_ERROR_CODE_UNAUTHORIZED = 101;
    // 错误JSON的code值：存在进行中的订单 用户客服端需要提示是否进入行程提示
    int JSON_INFO_ERROR_CODE_EXIST_ORDER = 102;
}
