package com.springboot.springboot_web.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RequestController {

    @GetMapping("/go")
    public String goPage(HttpServletRequest request){
        request.setAttribute("msg","请求域中的信息msg");
        request.setAttribute("code",200);
        return "forward:/success";
    }

    @ResponseBody // 将返回值的map参数响应给浏览器
    @GetMapping("/success")
    public Map success(HttpServletRequest request,
                       @RequestAttribute("msg") String msg,
                       @RequestAttribute("code") Integer code){
        Map<String,Object> map = new HashMap<>();
        map.put("res_msg",request.getAttribute("msg"));
        map.put("res_code",request.getAttribute("code"));
        map.put("msg",msg);
        map.put("code",code);
        return map;
    }

}
