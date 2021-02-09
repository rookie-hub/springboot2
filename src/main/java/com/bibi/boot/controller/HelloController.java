package com.bibi.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// 这是一个@Controller注解和@ResponseBody的联合注解
//表示该类是一个处理器类,并且该类的所有方法的返回值直接返回给浏览器而不是返回视图
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello SpringBoot2 ！！！！";
    }
}
