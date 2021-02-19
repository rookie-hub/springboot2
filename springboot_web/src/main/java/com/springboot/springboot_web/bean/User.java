package com.springboot.springboot_web.bean;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    public String name;
    public int age;
    public Date date;
}
