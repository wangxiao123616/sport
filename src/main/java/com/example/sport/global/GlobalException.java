package com.example.sport.global;

import java.io.Serializable;

/**
 * @author nmy
 * @title: GlobalException
 * @date 2022-10-04 22:42
 */
public class GlobalException extends RuntimeException implements Serializable {

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public GlobalException(int code, String message) {
        super(message);
        this.code = code;
    }

    public GlobalException(ResultCode result) {
        super(result.msg());
        this.code = result.code();
    }

}
