package com.ketech.bq.ketech.common;

/******************
 * @描述：  异常数据格式 bean
 * @createBy:lailai
 * @data:2019/3/25 14:37
 */
public class Result<T> {

    // 请求是否成功标志位
    private boolean success;

    //error_code 状态值
    private String error_code;

    //error_msg 错误信息
    private String msg;

    //content 返回体报文的出参，使用泛型兼容不同的类型
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData(Object object) {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success="+ success +
                "status=" + error_code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
