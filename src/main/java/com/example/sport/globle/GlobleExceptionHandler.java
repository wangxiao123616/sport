package com.example.sport.globle;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author nmy
 * @title: GlobleExceptionHandler
 * @date 2022-10-04 23:07
 */
@RestControllerAdvice
public class GlobleExceptionHandler {

    @ExceptionHandler(GlobleException.class)
    @ResponseBody
    public IResponse handleException(GlobleException e) {
        IResponse response = new IResponse();
        response.setCode(e.getCode());
        response.setMsg(e.getMessage());
        return response;
    }

}
