package com.ketech.bq.ketech.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: @hw
 * Create:  2019-07-19 17:18
 * Description: 物品实体
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoefjObjectEntity {
    /**
     * ID	ID	string
     * WPBH	物品编号	string
     * WPLX	物品类型	string
     * WPJS	物品角色	string
     * GSD	归属地	string
     * WPZT	物品状态	string
     * SJLY	数据来源	string
     * LYB	来源表	string
     * LYB_ID	来源表ID	string
     * BQ	标签	string
     * GXSJ	更新时间	timestamp
     * CREATEDTIME	实体创建时间	timestamp
     */
    private String labelType;
    private String id;
    private String wpbh;
    private String wplx;
    private String wpjs;
    private String gsd;
    private String wpzt;
    private String sjly;
    private String lyb;
    private String lyb_id;
    private String bq;
    private String gxsj;
    private String createdtime;

}