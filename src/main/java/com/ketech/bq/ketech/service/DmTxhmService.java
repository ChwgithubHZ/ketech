package com.ketech.bq.ketech.service;


import com.ketech.bq.ketech.annotation.LogWrite;
import com.ketech.bq.ketech.bean.ParamsBean;
import com.ketech.bq.ketech.common.DescribeException;
import com.ketech.bq.ketech.common.ExceptionEnum;
import com.ketech.bq.ketech.entity.DmTxhmEntity;
import com.ketech.bq.ketech.entity.DmTxhmEntityExample;
import com.ketech.bq.ketech.mapper.DmTxhmEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/******************
 * @描述：
 * @createBy:lailai
 * @data:2019/6/28 15:24
 */
@Service("DmTxhmService")
public class DmTxhmService extends AbstractService<List<DmTxhmEntity>,DmTxhmEntityExample> {

    @Autowired
    private DmTxhmEntityMapper dmTxhmEntityMapper;

    @LogWrite( operationType="query" , operationContent="手机号码标签查询",isStoreQuery=false)
    public List<DmTxhmEntity> mergeParams(ParamsBean params){
        List<DmTxhmEntityExample> params_list = new ArrayList<>();
        DmTxhmEntityExample example = new DmTxhmEntityExample();

        DmTxhmEntityExample.Criteria criteria = example.createCriteria();

        if(params.getQuerytype().equals("1")){ // 手机号
            criteria.andZhlxdhLike("%" + params.getQueryparams() +"%");
        }else{ //可拓展，如身份证
            throw new DescribeException(ExceptionEnum.params_unknow);
        }
        params_list.add(example);
        List<DmTxhmEntity> result = new ArrayList<DmTxhmEntity>() ;
        //多个参数查询结果
        List<List<DmTxhmEntity>> lists = super.mergeParams(params_list);
        for(List<DmTxhmEntity> bmlist :lists){
            result.addAll(bmlist);
        }
        return result ;
    }

    @Override
    protected List<DmTxhmEntity> doQuery(DmTxhmEntityExample params) {
        return  dmTxhmEntityMapper.selectByExample(params);
    }

}
