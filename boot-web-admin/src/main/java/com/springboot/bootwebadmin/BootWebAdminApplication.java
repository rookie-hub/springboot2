package com.springboot.bootwebadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@ServletComponentScan(basePackages = "")
@ServletComponentScan
@SpringBootApplication
public class BootWebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootWebAdminApplication.class, args);
    }

}
