package com.bibi.boot;

import com.bibi.boot.controller.bean.Pet;
import com.bibi.boot.controller.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
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

       /* //获取配置类中的Pet类实例对象
        Pet tom = run.getBean("tom", Pet.class);
        System.out.println(tom);*/

        //获取配置类中的User类实例对象
        User user = run.getBean("toUser", User.class);
        System.out.println("=====" + user);
        int beanDefinitionCount = run.getBeanDefinitionCount();//获取容器的组件个数
        System.out.println(beanDefinitionCount);//129
        String[] beanNamesForType = run.getBeanNamesForType(WebMvcProperties.class);
        System.out.println("webmvc的组件个数==="+beanNamesForType.length);//webmvc的组件个数===1
       /* 总结：
• SpringBoot先加载所有的自动配置类  xxxxxAutoConfiguration
• 每个自动配置类按照条件进行生效，默认都会绑定配置文件指定的值。xxxxProperties里面拿。xxxProperties和配置文件进行了绑定
• 生效的配置类就会给容器中装配很多组件
• 只要容器中有这些组件，相当于这些功能就有了
• 定制化配置
• 用户直接自己@Bean替换底层的组件
• 用户去看这个组件是获取的配置文件什么值就去修改。
        xxxxxAutoConfiguration ---> 组件  ---> xxxxProperties里面拿值  ----> application.properties*/

    }
}
