package com.example.sport.domain.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String account;
    private String uName;
    private Integer gender;
    private String name;
    private Integer age;
    private String phone;
    private String headImg;
    private String authority;
}
