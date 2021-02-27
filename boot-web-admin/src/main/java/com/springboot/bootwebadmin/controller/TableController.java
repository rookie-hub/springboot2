package com.springboot.bootwebadmin.controller;

import com.springboot.bootwebadmin.bean.User;
import com.springboot.bootwebadmin.exception.UserToManyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    /**
     * 跳转basic_table.html页面
     * @return
     */
    @GetMapping("/basic_table")
    public String basic_table(){
        //int i = 3/0;
        return "table/basic_table";
    }
    @GetMapping("/sql")
    @ResponseBody
    public Integer sql(){
        Integer i = jdbcTemplate.queryForObject("select count(*) from userinfo", Integer.class);
        return i;
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model){
        List<User> users = Arrays.asList(new User("zs", "23"),
                new User("ls", "24"),
                new User("ww", "25"),
                new User("zl", "26"));
        model.addAttribute("users",users);
        if(users.size()>1){
            throw new UserToManyException();
        }
        return "table/dynamic_table";
    }
    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }
    @GetMapping("/pricing_table")
    public String pricing_table(){
        return "table/pricing_table";
    }
}
