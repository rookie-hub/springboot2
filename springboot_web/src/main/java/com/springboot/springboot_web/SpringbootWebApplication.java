package com.springboot.springboot_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
@ServletComponentScan
public class SpringbootWebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootWebApplication.class, args);
        String[] beanNamesForType = run.getBeanNamesForType(CharacterEncodingFilter.class);//根据class对象判断容器中是否存在这个Bean对象
        //boolean tom = run.containsBean("tom");//根据对象的ID判断容器中是否存在这个Bean对象
        System.out.println("CharacterEncodingFilter的组件个数==="+beanNamesForType.length);//webmvc的组件个数===1
    }

}
