package com.springboot.springboot_web.contrller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController // 对于请求的参数处理
public class ParamTestController {

    // 获取请求URL中的参数 /url/1/own/zhangsan
    @RequestMapping("/url/{id}/own/{username}")
    public Map<String,Object> getUrl(@PathVariable("id") Integer id,
                                     @PathVariable("username")String name,
                                     @PathVariable Map<String,String> map,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String,String> heads,
                                     @RequestParam("age") Integer age,
                                     @RequestParam("inters") List<String> list,
                                     @RequestParam Map<String,String> param,
                                     @CookieValue("csrftoken") String csrftoken,
                                     @CookieValue("csrftoken") Cookie cookie){
        // @PathVariable将URL中所有参数封装到当前方法参数map中,那么这个map的类型必须是<String,String>
        // @RequestHeader将所有的请求头信息封装到当前方法参数map中,那么这个map的类型必须是<String,String>
        Map<String, Object> hashMap = new HashMap<>();
//        hashMap.put("id",id);
//        hashMap.put("name",name);
//        hashMap.put("map",map);
//        hashMap.put("agent",userAgent);
//        hashMap.put("heads",heads);
        hashMap.put("age",age);
        hashMap.put("list",list);
        hashMap.put("param",param);
        hashMap.put("cookie",csrftoken);
        System.out.println(cookie); //javax.servlet.http.Cookie@e4109ac
        System.out.println(cookie.getName() + "=====" + cookie.getValue());

        return hashMap;
    }

    @PostMapping("/save")
    public Map post(@RequestBody String content){
        Map<String, Object> map = new HashMap<>();
        map.put("content",content);
        System.out.println("前端页面中文==" + content);
        return map;
    }

    @GetMapping("/cars/{path}")
    public Map matrixVariable(@MatrixVariable("low") Integer low,
                              @MatrixVariable("brand") String brand,
                              @PathVariable("path") String path){
        Map<String, Object> map = new HashMap<>();
        map.put("low",low);
        map.put("brand",brand);
        map.put("path",path);
        return map;
    }
    // 矩阵变量中多个url下的同名变量参数 /boss/1;age=20/2;age=10
    @GetMapping("/boss/{bossId}/{empId}")
    public Map boos(@MatrixVariable(value = "age",pathVar = "bossId") Integer bossAge,
                    @MatrixVariable(value = "age",pathVar = "empId") String empAge){
        Map<String, Object> map = new HashMap<>();
        map.put("bossAge",bossAge);
        map.put("empAge",empAge);
        return map;
    }
}
