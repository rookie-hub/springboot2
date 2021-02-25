package com.springboot.bootwebadmin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    /**
     * 所有属性都应该在数据库中
     */
    private String userName;
    private String password;


}
