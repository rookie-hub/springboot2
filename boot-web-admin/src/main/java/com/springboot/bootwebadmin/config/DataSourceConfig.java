package com.springboot.bootwebadmin.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DataSourceConfig {
    // 默认的自动配置是判断容器中没有才会配@ConditionalOnMissingBean(DataSource.class)
    @Bean
    @ConfigurationProperties("spring.datasource")//将DruidDataSource中的属性与配置文件中spring.datasource下的参数进行绑定
    public DataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setFilters("stat");//加入监控功能
        return druidDataSource;
    }
    @Bean
    public ServletRegistrationBean statViewServlet(){
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>(statViewServlet, "/druid/*");
//        registrationBean.addInitParameter("loginUsername","admin");
//        registrationBean.addInitParameter("loginPassword","123456");


        return registrationBean;
    }
}
