package com.springboot.bootwebadmin;

import com.alibaba.druid.support.http.StatViewServlet;
import com.springboot.bootwebadmin.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class BootWebAdminApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
        Integer i = jdbcTemplate.queryForObject("select count(*) from userinfo", Integer.class);
        System.out.println("userinfo表的记录数为"+i);//5
        log.info("数据源的类型: "+dataSource.getClass());
        //数据源的类型: class com.alibaba.druid.pool.DruidDataSource
    }


}
