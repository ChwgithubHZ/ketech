package com.ketech.bq.ketech.annotation;

import java.lang.annotation.*;

/******************
 * @描述： 校验签名合法性 自定义
 * @createBy:lailai
 * @data:2019/3/25 14:37
 */
// 用于描述注解的范围， PARAMETER表示参数，METHOD表示用于方法
@Target({ElementType.PARAMETER,ElementType.METHOD})
//表示注解运行期有效
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface TokenValid {

    boolean isValidToken()  default true;//是否验证

    String operationContent() default "";//操作内容

    boolean isStoreQuery();//是否记录查询条件
}
