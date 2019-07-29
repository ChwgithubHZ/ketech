package com.ketech.bq.ketech.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: @hw
 * Create:  2019-07-19 17:19
 * Description: 案件实体
 */

@Data


public class NoefjCaseEntity {
    /**
     * ID	ID	string
     * ASJBH	案事件编号	string
     * ASJLX	案事件类型	string
     * LASJ	立案时间	string
     * LADW	立案单位	string
     * ZBR	主办人	string
     * ZBDW	主办单位	string
     * ZBRLXDH	主办人联系电话	string
     * SJLY	数据来源	string
     * LYB	来源表	string
     * LYB_ID	来源表ID	string
     * BQ	标签	string
     * GXSJ	更新时间	timestamp
     * CREATEDTIME	实体创建时间	timestamp
     */
    private String labelType;
    private String id;
    private String asjbh;
    private String asjlx;
    private String lasj;
    private String ladw;
    private String zbr;
    private String zbdw;
    private String zbrlxdh;
    private String sjly;
    private String lyb;
    private String lyb_id;


    private String bq;
    private String gxsj;
    private String createdtime;


}
