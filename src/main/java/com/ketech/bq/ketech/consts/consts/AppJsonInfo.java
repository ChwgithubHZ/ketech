package com.ketech.bq.ketech.consts.consts;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: @hw
 * Create:  2019-04-24 09:17
 * Description: JSON响应对象，均由此类封装
 */
public class AppJsonInfo implements Serializable {
    // code=200：表示请求成功；其他值为失败
    private Integer code;
    // 失败或成功消息
    private String msg;
    // 返回的数据
    private Object data;

    private AppJsonInfo() {
    }

    public static AppJsonInfo build(int code, Object data, String msg) {
        AppJsonInfo json = new AppJsonInfo();
        json.code = code;
        json.data = data == null ? "" : data;
        json.msg = msg == null ? "" : msg;
        return json;
    }


    /**
     * code=200：表示请求成功；其他值为失败
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
