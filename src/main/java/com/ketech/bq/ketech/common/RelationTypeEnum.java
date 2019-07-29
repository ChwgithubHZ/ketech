package com.ketech.bq.ketech.common;

/**
 * Created by Louzh on 2019/7/26.
 */
public enum  RelationTypeEnum {
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "炎炎盛夏"),
    FALL("秋天", "秋高气爽"),
    WINTER("冬天", "大雪纷飞");

    private final String name;
    private final String desc;

    private RelationTypeEnum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
