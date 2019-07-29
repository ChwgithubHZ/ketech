package com.ketech.bq.ketech.bean;

import lombok.Data;

import javax.validation.constraints.NotNull;

/******************
 * @描述：查询条件bean
 * @createBy:lailai
 * @data:2019/7/3 9:22
 */

@Data
public class ParamsBean {

    private String querytype;

    private String queryparams;


    // 页码
    private Integer pagenum;
    // 每页条数
    private Integer pagesize;

    //    neo4j 查询入参数
    //开始标签
    @NotNull
    private String startLabels;
    //结束标签
    @NotNull
    private String endLabels;
    //属性类型
    @NotNull
    private String attributeType;
    //关系类型
    @NotNull
    private String relationType;
    //属性值
    @NotNull
    private String attributeValue;
    //关系实体-单个
    @NotNull
    private String label;
    //关系层级
    @NotNull
    private String layer;


}
