package com.ketech.bq.ketech.common;

/******************
 * @描述： 发生异常后，异常抛出类
 * @createBy:lailai
 * @data:2019/3/25 14:37
 */
public class DescribeException extends RuntimeException{


    private String code;

    /**
     * 继承exception，加入错误状态值
     * @param exceptionEnum
     */
    public DescribeException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }

    /**
     * 自定义错误信息
     * @param message
     * @param code
     */
    public DescribeException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
