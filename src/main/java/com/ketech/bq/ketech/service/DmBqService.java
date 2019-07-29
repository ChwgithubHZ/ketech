package com.ketech.bq.ketech.service;

import com.ketech.bq.ketech.annotation.LogWrite;
import com.ketech.bq.ketech.bean.ParamsBean;
import com.ketech.bq.ketech.common.DescribeException;
import com.ketech.bq.ketech.common.ExceptionEnum;
import com.ketech.bq.ketech.entity.DmBqBean;
import com.ketech.bq.ketech.entity.DmBqBeanExample;
import com.ketech.bq.ketech.mapper.DmBqBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/******************
 * @描述： 标签库查询
 * @createBy:lailai
 * @data:2019/6/27 17:12
 */
@Service("DmBqService")
public class DmBqService extends AbstractService<List<DmBqBean>,DmBqBeanExample> {

    @Autowired
    private DmBqBeanMapper dmBqBeanMapper;

    @LogWrite( operationType="query" , operationContent="银行卡号标签查询",isStoreQuery=false)
    public List<DmBqBean> mergeParams(ParamsBean params){
        List<DmBqBeanExample> params_list = new ArrayList<>();
        DmBqBeanExample example = new DmBqBeanExample();
        DmBqBeanExample.Criteria criteria = example.createCriteria();
        if(params.getQuerytype().equals("1")){ // 银行卡号
            criteria.andZhjyzhLike("%" + params.getQueryparams() +"%");
        }else{ //可拓展，如身份证
            throw new DescribeException(ExceptionEnum.params_unknow);
        }
        params_list.add(example);

        List<DmBqBean> result = new ArrayList<DmBqBean>() ;
        //多个参数查询结果
        List<List<DmBqBean>> lists = super.mergeParams(params_list);
        for(List<DmBqBean> bmlist :lists){
            result.addAll(bmlist);
        }
        return result ;
    }

    @Override
    protected List<DmBqBean> doQuery(DmBqBeanExample params) {
        return  dmBqBeanMapper.selectByExample(params);
    }
}
