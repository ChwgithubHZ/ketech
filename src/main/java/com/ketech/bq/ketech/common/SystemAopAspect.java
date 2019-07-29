package com.ketech.bq.ketech.common;

import com.ketech.bq.ketech.bean.ParamsBean;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.regex.Pattern;

/******************
 * @描述：aop
 * @createBy:lailai
 * @data:2019/3/25 14:37
 */
@Aspect
@Component
public class SystemAopAspect {

    private final static Logger LOGGER = LoggerFactory.getLogger(SystemAopAspect.class);

    @Autowired
    private ExceptionHandle exceptionHandle;

    @Pointcut("@annotation(com.ketech.bq.ketech.annotation.LogWrite)")
    public void log(){

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint)throws IOException {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //ip
        LOGGER.info("ip={}",request.getRemoteAddr()); //在客户端没有使用代理的情况下获取到客户端的真实IP地址
        //url
        LOGGER.info("request url={}",request.getRequestURL());
        //method
        LOGGER.info("method={}",request.getMethod());
        //class_method
        LOGGER.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName() + "," + joinPoint.getSignature().getName());
        //args[]
        LOGGER.info("args={}",joinPoint.getArgs());

        Object[] objects = joinPoint.getArgs();
        ParamsBean params = ( ParamsBean) objects[0];
        objects = null;
        if(params == null) throw new DescribeException(ExceptionEnum.params_unknow);
        if(params.getQuerytype() == null || params.getQueryparams() == null){
            throw new DescribeException(ExceptionEnum.params_unknow);
        }
        if(!Pattern.matches("^[A-Za-z0-9]+$",params.getQueryparams())){
            throw new DescribeException(ExceptionEnum.sql_autowrid_error);
        }
//        throw new DescribeException(ExceptionEnum.valid_token);
    }

    @Around("log()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Result result = null;
        try {

        } catch (Exception e) {
            return exceptionHandle.errorHandler(e);
        }
        if(result == null){
            return proceedingJoinPoint.proceed();
        }else {
            return result;
        }
    }

    @AfterReturning(pointcut = "log()",returning = "object")//打印输出结果
    public void doAfterReturing(Object object){
        LOGGER.info("response={}",object.toString());
    }

}
