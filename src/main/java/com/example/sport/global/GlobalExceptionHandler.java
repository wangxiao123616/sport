package com.example.sport.global;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author nmy
 * @title: GlobalExceptionHandler
 * @date 2022-10-04 23:07
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GlobalException.class)
    @ResponseBody
    public IResponse handleException(GlobalException e) {
        IResponse response = new IResponse();
        response.setCode(e.getCode());
        response.setMsg(e.getMessage());
        return response;
    }

}
