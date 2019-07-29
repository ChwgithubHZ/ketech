package com.ketech.bq.ketech.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: @hw
 * Create:  2019-07-19 16:16
 * Description: NOE4J 关系实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoefjRelation {

    private String id;
    //实体ID1
    private String stid1;
    //实体表1
    private String stb1;
    //角色1
    private String js1;
    //实体ID2
    private String stid2;
    //实体表2
    private String stb2;
    //角色2
    private String js2;
    //来源表
    private String s_tb;
    //关系描述
    private String gxms;
    //更新时间
    private String gxsj;
    //关系标签
    private String gxbq;
    //来源
    private String ly;
    //置信度
    private String zxd;
    //表创建时间
    private String createdtime;

}
