package com.springboot.springboot_web.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
    @GetMapping("/thy")
    public String thymeleafView(Model model){
        //model中的数据会被放到请求域中
        model.addAttribute("msg","你好 model");
        model.addAttribute("link","https://www.baidu.com/");

        return "success";
    }
}
