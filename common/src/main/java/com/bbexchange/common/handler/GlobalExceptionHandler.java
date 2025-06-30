package com.bbexchange.common.handler;

import com.bbexchange.common.constance.enums.SystemErrorEnum;
import com.bbexchange.common.exception.BusinessException;
import com.bbexchange.common.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.OK)
    public Response<?> handlerBusinessException(BusinessException e){
        e.printStackTrace();
        return Response.error(e.getBaseEnum());
    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Response<?> handlerException(Exception e){
        e.printStackTrace();
        return Response.error(SystemErrorEnum.SYSTEM_ERROR_1);
    }
}
