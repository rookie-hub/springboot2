package com.springboot.bootwebadmin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table("userinfo")
public class Userinfo {
    @Id
    private Integer id;
    @Column
    private Integer age;
    @Column
    private String name;
    @Column
    private Data birth;
    @Column
    private Data createtime;
}
