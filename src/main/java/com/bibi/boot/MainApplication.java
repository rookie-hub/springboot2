package com.bibi.boot;

import com.bibi.boot.controller.bean.Pet;
import com.bibi.boot.controller.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
@SpringBootApplication : 这是一个springboot应用
该类是主程序类
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        // 获取IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //获取配置类中的Pet类实例对象
        Pet tom = run.getBean("tom", Pet.class);
        System.out.println(tom);

        //获取配置类中的User类实例对象
        User user = run.getBean("toUser", User.class);
        System.out.println(user);

    }
}
