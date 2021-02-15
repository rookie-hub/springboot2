package com.springboot.springboot_web.contrller;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class ResourcesController {
    @RequestMapping("/2.jpg")
    public String hello(){
        return "aaa";
    }

//    @RequestMapping("/")
//    public String index(){
//        return "index2";
//    }
//    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getUser(){
        return "GET——张三";
    }
//    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public String postUser(){
        return "Post——张三";
    }
//    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @PutMapping("/user")
    public String putUser(){
        return "Put——张三";
    }
//    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    @DeleteMapping("/user")
    public String deleteUser(){
        return "DELETE——张三";
    }
}
