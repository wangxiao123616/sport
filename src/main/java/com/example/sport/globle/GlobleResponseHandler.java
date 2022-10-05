package com.example.sport.globle;

import com.alibaba.fastjson.JSON;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author nmy
 * @title: GlobleResponseHandler
 * @date 2022-10-04 23:18
 */
@RestControllerAdvice(annotations = RestController.class)
public class GlobleResponseHandler implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (o instanceof IResponse) {
            return o;
        }

        IResponse in = new IResponse();
        in.setCode(200);
        in.setMsg("success");
        in.setData(o);
        if (o instanceof String) {
            return JSON.toJSONString(in);
        }

        return in;
    }
}
