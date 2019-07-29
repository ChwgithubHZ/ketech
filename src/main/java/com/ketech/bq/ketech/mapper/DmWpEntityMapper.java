package com.ketech.bq.ketech.mapper;

import com.ketech.bq.ketech.entity.DmWpEntity;
import com.ketech.bq.ketech.entity.DmWpEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmWpEntityMapper {
    long countByExample(DmWpEntityExample example);

    int deleteByExample(DmWpEntityExample example);

    int insert(DmWpEntity record);

    int insertSelective(DmWpEntity record);

    List<DmWpEntity> selectByExample(DmWpEntityExample example);

    int updateByExampleSelective(@Param("record") DmWpEntity record, @Param("example") DmWpEntityExample example);

    int updateByExample(@Param("record") DmWpEntity record, @Param("example") DmWpEntityExample example);
}