package com.ketech.bq.ketech.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: @hw
 * Create:  2019-07-19 17:15
 * Description: noe4j 人员实体
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoefjPeopleEntity {

    private String labelType;

    //ID

    private String id;
    //人员类别
    private String rylb;

    //姓名
    private String xm;
    //证件类型
    private String zjlx;
    //证件号码
    private String zjhm;
    //性别
    private String xb;
    //职业
    private String zy;
    //数据来源
    private String sjly;
    //来源表
    private String lyb;
    //来源表ID
    private String lyb_id;
    //标签
    private String bq;
    //更新时间
    private String gxsj;

    //实体创建时间
    private String createdtime;

}
