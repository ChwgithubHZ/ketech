package com.ketech.bq.ketech.util;

import com.ketech.bq.ketech.common.DescribeException;
import com.ketech.bq.ketech.common.ExceptionEnum;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/******************
 * @描述：
 * @createBy:lailai
 * @data:2019/6/20 15:52
 */
public class ThreadPoolBean<T> {

    private Logger logger = Logger.getLogger(getClass()) ;

    private int poolSize = 3 ;

    public ThreadPoolBean(int poolSize){
        this.poolSize = poolSize;
    }

    // 创建线程池
    private ExecutorService pool = Executors.newFixedThreadPool(poolSize);

    List<Future<T>> resultList = new ArrayList<Future<T>>();

    public List<T> execute(List<Callable<T>> tasks, long timeOut) {
        try{
            List<T> result = new ArrayList<>() ;
            int taskNum = tasks.size() ;
            for (int i = 0; i < taskNum; i++) {
                Future<T> future =  pool.submit( tasks.get(i) );
                //将任务执行结果存储到List中
                resultList.add(future);
            }

            for (Future<T> fs : resultList){
//                while(!fs.isDone()){ // isDone if this task completed
//                    result.add(fs.get());
//                }
                result.add(fs.get());
            }
            return  result;
        }catch (Exception e){
            e.printStackTrace();
            throw new DescribeException(ExceptionEnum.pool_query_error);
        }
        finally{
            //启动一次顺序关闭，执行以前提交的任务，但不接受新任务
            pool.shutdown();
        }
    }

}
