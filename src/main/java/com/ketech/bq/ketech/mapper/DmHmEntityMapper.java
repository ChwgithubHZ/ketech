package com.ketech.bq.ketech.mapper;

import com.ketech.bq.ketech.entity.DmHmEntity;
import com.ketech.bq.ketech.entity.DmHmEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmHmEntityMapper {
    long countByExample(DmHmEntityExample example);

    int deleteByExample(DmHmEntityExample example);

    int insert(DmHmEntity record);

    int insertSelective(DmHmEntity record);

    List<DmHmEntity> selectByExample(DmHmEntityExample example);

    int updateByExampleSelective(@Param("record") DmHmEntity record, @Param("example") DmHmEntityExample example);

    int updateByExample(@Param("record") DmHmEntity record, @Param("example") DmHmEntityExample example);
}