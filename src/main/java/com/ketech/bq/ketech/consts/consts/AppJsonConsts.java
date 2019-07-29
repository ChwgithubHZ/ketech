package com.ketech.bq.ketech.consts.consts;


import com.ketech.bq.ketech.dataconfig.ResultJsonUtil;

/**
 * Created with IntelliJ IDEA.
 * Author: @hw
 * Create:  2019-04-24 09:15
 * Description: 固定的json结构
 */
public class AppJsonConsts {
    // 只含有一个成功code的json
    public static final String SUCCESS_default = ResultJsonUtil.buildSuccessMsgJson(null);

    public static final String ERROR_404 = ResultJsonUtil.buildErrorJson(404, AppMsgConsts.ERROR_404);
    public static final String ERROR_400 = ResultJsonUtil.buildErrorJson(400, AppMsgConsts.ERROR_400);
    public static final String ERROR_403 = ResultJsonUtil.buildErrorJson(401, AppMsgConsts.ERROR_403);
    public static final String ERROR_500 = ResultJsonUtil.buildErrorJson(401, AppMsgConsts.ERROR_500);

    public static final String ERROR_system_error = ResultJsonUtil.buildErrorJson(AppBaseConsts.JSON_INFO_ERROR_CODE_EXCEPTION, AppMsgConsts.SYSTEM_ERROR);

    public static final String ERROR_parameters_error = ResultJsonUtil.buildErrorJson(AppBaseConsts.JSON_INFO_ERROR_CODE_ILLEGAL_REQUEST, AppMsgConsts.PARAMETERS_ERROR);
    public static final String ERROR_version_required = ResultJsonUtil.buildErrorJson(AppBaseConsts.JSON_INFO_ERROR_CODE_ILLEGAL_REQUEST, "v required.");
    public static final String ERROR_platform_required = ResultJsonUtil.buildErrorJson(AppBaseConsts.JSON_INFO_ERROR_CODE_ILLEGAL_REQUEST, "pf required.");
    public static final String ERROR_package_name_illegal = ResultJsonUtil.buildErrorJson(AppBaseConsts.JSON_INFO_ERROR_CODE_ILLEGAL_REQUEST, AppMsgConsts.PACKAGE_NAME_ILLEGAL);
    public static final String ERROR_screen_info_required = ResultJsonUtil.buildErrorJson(AppBaseConsts.JSON_INFO_ERROR_CODE_ILLEGAL_REQUEST, "screen-width and screen-height required.");
    public static final String ERROR_version_illegal = ResultJsonUtil.buildErrorJson(AppBaseConsts.JSON_INFO_ERROR_CODE_ILLEGAL_REQUEST, "v illegal.");
    public static final String ERROR_deviceId_illegal = ResultJsonUtil.buildErrorJson(AppBaseConsts.JSON_INFO_ERROR_CODE_ILLEGAL_REQUEST, "d illegal.");
    public static final String ERROR_userToken_required = ResultJsonUtil.buildErrorJson(AppBaseConsts.JSON_INFO_ERROR_CODE_ILLEGAL_REQUEST, "ut required.");
    // 用户自己被禁用了，同时返回101
    public static final String ERROR_101_current_account_auth_timeout = ResultJsonUtil.buildErrorJson(AppBaseConsts.JSON_INFO_ERROR_CODE_UNAUTHORIZED, AppMsgConsts.ACCOUNT_AUTH_TIMEOUT);
    public static final String ERROR_101_user_permanent_blocked = ResultJsonUtil.buildErrorJson(AppBaseConsts.JSON_INFO_ERROR_CODE_UNAUTHORIZED, AppMsgConsts.USER_PERMANENT_BLOCKED);
    public static final String ERROR_phone_number_illegal = ResultJsonUtil.buildErrorJson(AppMsgConsts.PHONE_NUMBER_ILLEGAL);

    public static final String ERROR_smscode_number_illegal = ResultJsonUtil.buildErrorJson(AppMsgConsts.ERROR_SMSCODE);
    public static final String ERROR_user_already_enroll = ResultJsonUtil.buildErrorJson(AppMsgConsts.ERROR_AlREADY_ENROLL);//短信验证未通过
    public static final String ERROR_user_login_disable = ResultJsonUtil.buildErrorJson(AppMsgConsts.ERROR_LOGIN_DISABLE);//账号已禁用
}
