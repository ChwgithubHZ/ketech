package com.ketech.bq.ketech.mapper;

import com.ketech.bq.ketech.entity.DmTxhmEntity;
import com.ketech.bq.ketech.entity.DmTxhmEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmTxhmEntityMapper {
    long countByExample(DmTxhmEntityExample example);

    int deleteByExample(DmTxhmEntityExample example);

    int insert(DmTxhmEntity record);

    int insertSelective(DmTxhmEntity record);

    List<DmTxhmEntity> selectByExample(DmTxhmEntityExample example);

    int updateByExampleSelective(@Param("record") DmTxhmEntity record, @Param("example") DmTxhmEntityExample example);

    int updateByExample(@Param("record") DmTxhmEntity record, @Param("example") DmTxhmEntityExample example);
}