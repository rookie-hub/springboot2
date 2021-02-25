package com.springboot.bootwebadmin.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler({ArithmeticException.class,NullPointerException.class})
    public String handleArithException(Exception ex){
        log.info("异常是{}",ex);
        return "login";
    }
}
