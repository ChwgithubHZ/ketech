package com.ketech.bq.ketech.service;

import com.ketech.bq.ketech.common.DescribeException;
import com.ketech.bq.ketech.common.ExceptionEnum;
import com.ketech.bq.ketech.util.ThreadPoolBean;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/******************
 * @描述： 服务基类
 * @createBy:lailai
 * @data:2019/6/28 9:52
 */
public abstract class AbstractService<T,E> {

    private Logger logger = Logger.getLogger(getClass()) ;

    /***********
     * 组合参数
     * @param params
     * @return
     */
    protected List<T> mergeParams(List<E> params){
        try{
            if( params == null || params.size() == 0 ){
                throw new DescribeException(ExceptionEnum.pool_params_isnull);
            }
            ThreadPoolBean<T> threads = new ThreadPoolBean<T>(params.size()) ;

            //多线程任务列表
            List<Callable<T>> tasks = new ArrayList<Callable<T>>() ;
            for(E p:params){
                final E param = p ;
                tasks.add(new Callable<T>() {
                    @Override
                    public T call() throws Exception {
                        if(Thread.interrupted()){
                            throw new InterruptedException() ;
                        }
                        T ref = doQuery(  param );
                        if( logger.isDebugEnabled() ){

                        }
                        return ref;
                    }
                }) ;
            }
            return threads.execute(tasks,2000);
        }catch (Exception e){
            throw new DescribeException(ExceptionEnum.pool_unknow_error);
        }
    }

    protected abstract T doQuery(E params);

}
