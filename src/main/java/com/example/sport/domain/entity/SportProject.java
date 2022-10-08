package com.example.sport.domain.entity;

public class SportProject {
    private Long id;
    private String pName;
    private Long cId;
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

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
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

    public SportProject(Long id, String pName, Long cId, Integer price, String describe, Integer count) {
        this.id = id;
        this.pName = pName;
        this.cId = cId;
        this.price = price;
        this.describe = describe;
        this.count = count;
    }

    public SportProject() {
    }

    @Override
    public String toString() {
        return "SportProject{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                ", cId=" + cId +
                ", price=" + price +
                ", describe='" + describe + '\'' +
                ", count=" + count +
                '}';
    }
}
