package com.springboot.springboot_web.contrller;

import com.springboot.springboot_web.bean.User;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class ResponseTestController {

    @GetMapping("/person")
    @ResponseBody
    public User getPerson(){
        User user = new User("张三", 23,new Date());
        return user;
    }
}
