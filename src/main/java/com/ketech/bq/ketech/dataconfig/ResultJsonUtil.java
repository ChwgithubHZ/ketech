package com.ketech.bq.ketech.dataconfig;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ketech.bq.ketech.consts.consts.*;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: @hw
 * Create:  2019-07-22 15:04
 * Description:
 */
public class ResultJsonUtil {

    public static String toJSONString(Object obj) {
        JSON.DEFFAULT_DATE_FORMAT = AppBaseConsts.FMT_yyyy_MM_dd_HH_mm_ss;
        return JSON.toJSONString(obj, SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.DisableCircularReferenceDetect);
    }

    /**
     * 构建成功JSON对象，并装载data，JsonInfo并序列化<p/>
     * 并设置JsonInfo.code=200<p/>
     * 并设置JsonInfo.data=data<p/>
     * 并设置JsonInfo.msg=null<p/>
     */
//    public static String buildSuccessDataJson(String key, Object value) {
//        Map<String, Object> dataMap = new HashMap<>(1);
//        dataMap.put(key, value);
//        return buildSuccessDataJson(dataMap);
//    }
    public static String buildSuccessDataJson(Object value) {
        return buildSuccessDataJson1(value);
    }

    /**
     * 构建成功JSON对象，并装载data，JsonInfo并序列化<p/>
     * 并设置JsonInfo.code=200<p/>
     * 并设置JsonInfo.data=data<p/>
     * 并设置JsonInfo.msg=null<p/>
     */
    public static String buildSuccessDataJson1(Object value) {
        return toJSONString(AppJsonInfo.build(AppBaseConsts.JSON_INFO_SUCCESS_CODE, value, null));
    }

    public static String buildSuccessDataJson(Map<String, Object> dataMap) {
        return toJSONString(AppJsonInfo.build(AppBaseConsts.JSON_INFO_SUCCESS_CODE, dataMap, null));
    }

    /**
     * 构建成功JSON对象，并装载data，JsonInfo并序列化<p/>
     * 并设置JsonInfo.code=200<p/>
     * 并设置JsonInfo.data=data<p/>
     * 并设置JsonInfo.msg=msg<p/>
     */
    public static String buildSuccessDataJson(Map<String, Object> dataMap, String msg) {
        return toJSONString(AppJsonInfo.build(AppBaseConsts.JSON_INFO_SUCCESS_CODE, dataMap, msg));
    }

    /**
     * 构建成功消息JSON对象，JsonInfo并序列化<p/>
     * 并设置JsonInfo.code=200<p/>
     * 并设置JsonInfo.data=null<p/>
     * 并设置JsonInfo.msg=msg<p/>
     */
    public static String buildSuccessMsgJson(String msg) {
        return toJSONString(AppJsonInfo.build(AppBaseConsts.JSON_INFO_SUCCESS_CODE, null, msg));
    }

    /**
     * 构建成功消息JSON对象，JsonInfo并序列化<p/>
     * 并设置JsonInfo.code=200<p/>
     * 并设置JsonInfo.data=null<p/>
     * 并设置JsonInfo.msg=null<p/>
     */
    public static String buildSuccessJson() {
        return AppJsonConsts.SUCCESS_default;
    }

    /**
     * 构建错误消息JSON对象，JsonInfo并序列化<p/>
     * 并设置JsonInfo.code=0<p/>
     * 并设置JsonInfo.data=null<p/>
     * 并设置JsonInfo.msg=null<p/>
     */
    public static String buildErrorJson(String msg) {
        return toJSONString(AppJsonInfo.build(AppBaseConsts.JSON_INFO_ERROR_CODE_DEFAULT, null, msg));
    }

    /**
     * 构建错误消息JSON对象，并指明特殊错误代码，JsonInfo并序列化<p/>
     * 并设置JsonInfo.code=code<p/>
     * 并设置JsonInfo.data=null<p/>
     * 并设置JsonInfo.msg=msg<p/>
     */
    public static String buildErrorJson(int code, String msg) {
        if (code == AppBaseConsts.JSON_INFO_SUCCESS_CODE) {
            code = AppBaseConsts.JSON_INFO_ERROR_CODE_DEFAULT;
        }
        return toJSONString(AppJsonInfo.build(code, null, msg));
    }


    /**
     * 构建错误消息JSON对象，并指明特殊错误代码，JsonInfo并序列化<p/>
     * 并设置JsonInfo.code=0<p/>
     * 并设置JsonInfo.data=data<p/>
     * 并设置JsonInfo.msg=msg<p/>
     */
    public static String buildErrorJson(Map<String, Object> dataMap, String msg) {
        return toJSONString(AppJsonInfo.build(AppBaseConsts.JSON_INFO_ERROR_CODE_DEFAULT, dataMap, msg));
    }

    /**
     * 构建错误消息JSON对象（发生异常专用），JsonInfo并序列化<p/>
     * 并设置JsonInfo.data=null<p/>
     * 并设置JsonInfo.code=500<p/>
     * 并设置JsonInfo.msg=AppMsgConsts.SYSTEM_ERROR<p/>
     */
    public static String buildExceptionJson(Throwable exception) {
        String msg = null;
        if (Config.isDebug) {
            msg = exception.toString();
        } else {
            msg = AppMsgConsts.SYSTEM_ERROR;
        }
        return toJSONString(AppJsonInfo.build(AppBaseConsts.JSON_INFO_ERROR_CODE_EXCEPTION, null, msg));
    }

    /**
     * 构建错误消息JSON对象，JsonInfo并序列化<p/>
     * 并设置JsonInfo.code=500<p/>
     * 并设置JsonInfo.data=null<p/>
     * 并设置JsonInfo.msg=msg<p/>
     */
    public static String buildExceptionJson(String msg) {
        return toJSONString(AppJsonInfo.build(AppBaseConsts.JSON_INFO_ERROR_CODE_EXCEPTION, null, msg));
    }
}
