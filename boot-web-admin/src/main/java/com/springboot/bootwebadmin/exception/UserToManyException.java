package com.springboot.bootwebadmin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户数量太多") //返回一个状态码信息,HttpStatus.FORBIDDEN表示403状态码,reason表示异常的信息
public class UserToManyException extends RuntimeException{
    public UserToManyException(String message){
        super(message);
    }
    public UserToManyException(){
    }
}
