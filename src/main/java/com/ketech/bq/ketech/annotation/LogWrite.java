package com.ketech.bq.ketech.annotation;

import java.lang.annotation.*;

/******************
 * @描述：日志切点
 * @createBy:lailai
 * @data:2019/3/25 14:37
 */
// 用于描述注解的范围， PARAMETER表示参数，METHOD表示用于方法
@Target({ElementType.PARAMETER,ElementType.METHOD})
//表示注解运行期有效
@Retention(RetentionPolicy.RUNTIME)

@Documented
//允许子类继承父类中的注解
@Inherited

//@interface意思是声明一个注解，方法名对应参数名，返回值类型对应参数类型。
public @interface LogWrite {

    String operationType()  default "";//查询类别

    String operationContent() default "";//操作内容

    boolean isStoreQuery();   //是否记录查询条件

}
