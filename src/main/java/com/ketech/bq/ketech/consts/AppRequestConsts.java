package com.ketech.bq.ketech.consts;

/**
 * Created with IntelliJ IDEA.
 * Author: @hw
 * Create:  2019-07-22 15:00
 * Description:
 */
public interface AppRequestConsts {
    /**
     * 请求返回的编码方式
     */
    String CHARSET = "UTF-8";
    /**
     * Controller 中 @RequestMapping{produces = AppRequestConsts.CONTENT_TYPE_JSON} 设置请求返回json数据的编码方式
     */
    String CONTENT_TYPE_JSON = "application/json;charset=" + CHARSET;
}
