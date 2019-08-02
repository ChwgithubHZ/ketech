package com.ketech.bq.ketech.service;

import com.ketech.bq.ketech.bean.ParamsBean;
import com.ketech.bq.ketech.bean.QueryParamsBean;
import com.ketech.bq.ketech.entity.DmWpEntityExample;
import com.ketech.bq.ketech.entity.TxlEntity;
import com.ketech.bq.ketech.entity.TxlEntityExample;
import com.ketech.bq.ketech.entity.TxlNameAndPhoneEntity;
import com.ketech.bq.ketech.mapper.mysqlmapper.TxlEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: @hw
 * Create:  2019-07-30 15:24
 * Description:
 */

@Service
public class DmTxlService {
    @Autowired
    private TxlEntityMapper txlEntityMapper;

    public List<TxlEntity> getTxlList(ParamsBean params) {
        TxlEntityExample example = new TxlEntityExample();
        TxlEntityExample.Criteria criteria = example.createCriteria();
        criteria.andGlzhmEqualTo(params.getQueryparams());
        criteria.andTxllxEqualTo(params.getQuerytype());
        return txlEntityMapper.selectByExample(example);
    }


    public List<TxlEntity> getOtherTxlList(ParamsBean params) {
        TxlEntityExample example = new TxlEntityExample();
        TxlEntityExample.Criteria criteria = example.createCriteria();
//        criteria.andGlzhmEqualTo(params.getQueryparams());
        criteria.andHmEqualTo(params.getQueryparams());
        criteria.andTxllxEqualTo(params.getQuerytype());
        return txlEntityMapper.selectByExample(example);

    }
}
