package com.bibi.boot.controller.config;

import com.bibi.boot.controller.bean.Pet;
import com.bibi.boot.controller.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean("tom")
    public Pet toPet(){
        return  new Pet("tomcat");
    }
    @Bean
    public User toUser(){
        return  new User("zs",15);
    }
}
