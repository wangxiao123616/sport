package com.example.sport.globle;

/**
 * @author nmy
 * @title: ResultCode
 * @date 2022-10-04 22:49
 */
public enum ResultCode {

    DEFAULT_CODE(1001,"测试");

    private final int code;

    private final String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String msg(){
        return msg;
    }

    public int code(){
        return code;
    }

    public static String getMsg(int code){
        for (ResultCode result:ResultCode.values()) {
            if (result.code == code){
                return result.msg;
            }
        }
        return null;
    }

    public static Integer getCode(String msg){
        for (ResultCode result : ResultCode.values()) {
            if (result.msg.equals(msg)) {
                return result.code;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return msg;
    }
}
