package com.example.sport.domain.entity;

public class SportPackage {
    private Long id;
    private String pName;
    private Integer price;
    private String describe;
    private Integer count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public SportPackage() {
    }

    public SportPackage(Long id, String pName, Integer price, String describe, Integer count) {
        this.id = id;
        this.pName = pName;
        this.price = price;
        this.describe = describe;
        this.count = count;
    }

    @Override
    public String toString() {
        return "SportPackage{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", describe='" + describe + '\'' +
                ", count=" + count +
                '}';
    }
}
