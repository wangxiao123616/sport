package com.example.sport.domain.entity;

public class Manager {
    private Long id;
    private String account;
    private String mName;
    private Integer gender;
    private String name;
    private Integer age;
    private String phone;
    private String headImg;
    private String authority;
    private Integer wage;

    public Manager() {
    }

    public Manager(Long id, String account, String mName, Integer gender, String name, Integer age, String phone, String headImg, String authority, Integer wage) {
        this.id = id;
        this.account = account;
        this.mName = mName;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.headImg = headImg;
        this.authority = authority;
        this.wage = wage;
    }

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

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
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

    public Integer getWage() {
        return wage;
    }

    public void setWage(Integer wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", mName='" + mName + '\'' +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", headImg='" + headImg + '\'' +
                ", authority='" + authority + '\'' +
                ", wage=" + wage +
                '}';
    }
}
