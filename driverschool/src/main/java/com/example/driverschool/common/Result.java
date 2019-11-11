package com.example.driverschool.common;

public class Result {

    //  封装好数据
    private Object data ;
    //  封装好返回的信息
    private String message ;
    //  返回是否成功
    public boolean bool ;

    public Result() {
    }
    public Result(String message, boolean bool) {
        this.message = message;
        this.bool = bool;
    }
    public Result(Object data, String message, boolean bool) {
        this.data = data;
        this.message = message;
        this.bool = bool;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean isBool() {
        return bool;
    }
    public void setBool(boolean bool) {
        this.bool = bool;
    }
}
