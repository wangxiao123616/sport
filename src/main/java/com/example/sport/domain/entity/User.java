package com.example.sport.domain.entity;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public User() {

    }

    public User(Long id, String account, String uName, Integer gender, String name, Integer age, String phone, String headImg, String authority) {
        this.id = id;
        this.account = account;
        this.uName = uName;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.headImg = headImg;
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", uName='" + uName + '\'' +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", headImg='" + headImg + '\'' +
                ", authority='" + authority + '\'' +
                '}';
    }
}
