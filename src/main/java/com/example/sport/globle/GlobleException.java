package com.example.sport.globle;

import java.io.Serializable;

/**
 * @author nmy
 * @title: GlobleException
 * @date 2022-10-04 22:42
 */
public class GlobleException extends RuntimeException implements Serializable {

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public GlobleException(int code, String message) {
        super(message);
        this.code = code;
    }

    public GlobleException(ResultCode result) {
        super(result.msg());
        this.code = result.code();
    }

}
