package com.ketech.bq.ketech.bean;

/******************
 * @描述： 统一返回数据实体类
 * @createBy:lailai
 * @data:2019/3/26 9:59
 */
public class QueryResultBean {

     private boolean success;

     private  int total;

     private  Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
