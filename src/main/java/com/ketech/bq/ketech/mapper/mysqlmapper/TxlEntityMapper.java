package com.ketech.bq.ketech.mapper.mysqlmapper;

import com.ketech.bq.ketech.bean.ParamsBean;
import com.ketech.bq.ketech.bean.QueryParamsBean;
import com.ketech.bq.ketech.entity.TxlEntity;
import com.ketech.bq.ketech.entity.TxlEntityExample;
import java.util.List;

import com.ketech.bq.ketech.entity.TxlNameAndPhoneEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TxlEntityMapper {
    int countByExample(TxlEntityExample example);

    int deleteByExample(TxlEntityExample example);

    int insert(TxlEntity record);

    int insertSelective(TxlEntity record);

    List<TxlEntity> selectByExample(TxlEntityExample example);

    int updateByExampleSelective(@Param("record") TxlEntity record, @Param("example") TxlEntityExample example);

    int updateByExample(@Param("record") TxlEntity record, @Param("example") TxlEntityExample example);



//
//    @Select("SELECT  hm ，hymc from dm_txl where GLZHM=#{queryparams} and TXLLX=#{querytype};")
    List<TxlEntity> selectByownPhone(ParamsBean params);

}