package com.ketech.bq.ketech.mapper;

import com.ketech.bq.ketech.entity.DmBqBean;
import com.ketech.bq.ketech.entity.DmBqBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmBqBeanMapper {
    long countByExample(DmBqBeanExample example);

    int deleteByExample(DmBqBeanExample example);

    int insert(DmBqBean record);

    int insertSelective(DmBqBean record);

    List<DmBqBean> selectByExample(DmBqBeanExample example);

    int updateByExampleSelective(@Param("record") DmBqBean record, @Param("example") DmBqBeanExample example);

    int updateByExample(@Param("record") DmBqBean record, @Param("example") DmBqBeanExample example);
}