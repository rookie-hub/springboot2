package com.springboot.springboot_web.contrller;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ResourcesController {
    @RequestMapping("/2.jpg")
    @ResponseBody
    public String hello(){
        return "aaa";
    }
/*    @RequestMapping("/")
    public String index(){
        return "index2";
    }*/
}
