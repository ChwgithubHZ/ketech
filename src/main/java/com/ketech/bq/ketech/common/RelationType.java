package com.ketech.bq.ketech.common;

import java.util.Map;

/**
 * Created by Louzh on 2019/7/26.
 */
public class RelationType {

    private static String relationType;

    public static String getRelationType(String gxms) {
        switch (gxms){
            case "ucase_asj_ryxx_asj_ry":
                return "同案人员";
            case "ucase_asj_ryxx_ry_lxdh":
                return "人员与联系电话";
            case "ucase_asj_ryxx_tagxr":
                return "同案人员";
            case "ucase_asj_txhm_mz_khr_txhm":
                return "开户人与通讯号码";
            case "ucase_asj_wll_aj_wll":
                return "案件网络流";
            case "ucase_asj_wlzcxxb_glqq_glwx":
                return "注册QQ与关联微信";
            case "ucase_asj_wlzcxxb_glyx_glqq":
                return "注册关联邮箱与关联QQ";
            case "ucase_asj_wlzcxxb_glyx_glwx":
                return "注册关联邮箱与关联微信";
            case "ucase_asj_wlzcxxb_lxdh_glqq":
                return "注册联系电话与关联QQ";
            case "ucase_asj_wlzcxxb_lxdh_glyx":
                return "注册联系电话与关联邮箱";
            case "ucase_asj_wlzcxxb_wlzh_glqq":
                return "网络账号与QQ";
            case "ucase_asj_wlzcxxb_wlzh_glwx":
                return "网络账号与微信";
            case "ucase_asj_wlzcxxb_wlzh_glyx":
                return "网络账号与邮箱";
            case "ucase_asj_wlzcxxb_wlzh_lxdh":
                return "网络账号与联系电话";
            case "ucase_asj_wlzcxxb_zcr_glqq":
                return "注册人与关联QQ";
            case "ucase_asj_wlzcxxb_zcr_glyx":
                return "注册人与关联邮箱";
            case "ucase_asj_wlzcxxb_zcr_lxdh":
                return "注册人与联系电话";
            case "ucase_asj_wlzcxxb_zcr_wlzh":
                return "注册人与网络账号";
            case "ucase_asj_xz_aj_jjd":
                return "案件与接警单";
            case "ucase_asj_zjl_aj_zjl":
                return "案件与资金流";
            case "ucase_asj_zjzh_mz_glyx_bdsj":
                return "资金账号中关联邮箱与绑定手机";
            case "ucase_asj_zjzh_mz_khr_bdsj":
                return "资金账号中开户人与关联绑定手机";
            case "ucase_asj_zjzh_mz_khr_glyx":
                return "资金账号中开户人与关联邮箱";
            case "ucase_asj_zjzh_mz_khr_lxdh":
                return "资金账号中开户人与联系电话";
            case "ucase_asj_zjzh_mz_khr_zjzh":
                return "资金账号中开户人与资金账号";
            case "ucase_asj_zjzh_mz_lxdh_bdsj":
                return "资金账号中联系电话与绑定手机";
            case "ucase_asj_zjzh_mz_lxdh_glyx":
                return "资金账号中联系电话与关联邮箱";
            case "ucase_asj_zjzh_mz_zjzh_bdsj":
                return "资金账号与绑定手机";
            case "ucase_asj_zjzh_mz_zjzh_glyx":
                return "资金账号与关联邮箱";
            case "ucase_asj_zjzh_mz_zjzh_lxdh":
                return "资金账号与联系电话";
            case "ucase_zfb_zhxx_zfb_bdsj":
                return "支付宝与绑定手机";
            case "ucmd_item_jjd_sdl":
                return "接警单与资金流、网络流、通讯流";
            case "ucmd_tgj_sjhmd_xyrhm_shrhm":
                return "黑名单库嫌疑人与受害人";
            case "ucmd_victim_jjd_shr":
                return "接警单与受害人";
            case "ucmd_victim_shr_dh":
                return "接警中受害人与电话";
        }
        return "";
    }

}
