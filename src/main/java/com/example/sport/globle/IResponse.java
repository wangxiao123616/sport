package com.example.sport.globle;

/**
 * @author nmy
 * @title: IResponse
 * @date 2022-10-04 23:09
        */
public class IResponse {

    private String msg;

    private int code;

    private Object data;

    public IResponse() {
    }

    public IResponse(String msg, int code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
