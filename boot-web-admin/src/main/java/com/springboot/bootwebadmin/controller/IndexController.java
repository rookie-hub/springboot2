package com.springboot.bootwebadmin.controller;

import com.springboot.bootwebadmin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    /**
     * 跳转登录页面
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String indexView(){
        return "login";
    }

    @PostMapping(value = "/login")
    public String mainView(User user, HttpSession session, Model model){
        //登录校验
        if(StringUtils.hasLength(user.getUserName())&&StringUtils.hasLength(user.getPassword())){
            //把登录成功的用户保存起来
            session.setAttribute("loginUser",user);
            //登录成功跳转main.html,防止页面重复提交
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser != null){
            System.out.println("被访问了一次。。。");
            return "main";
        }else{
            model.addAttribute("msg","请重新登录");
            return "login";
        }
    }
}
