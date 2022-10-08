package com.example.sport.domain.entity;

public class PackageDetail {
    private Long id;
    private Long pId;
    private Integer count;
    private String account;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public PackageDetail(Long id, Long pId, Integer count, String account) {
        this.id = id;
        this.pId = pId;
        this.count = count;
        this.account = account;
    }

    public PackageDetail() {

    }

    @Override
    public String toString() {
        return "PackageDetail{" +
                "id=" + id +
                ", pId=" + pId +
                ", count=" + count +
                ", account='" + account + '\'' +
                '}';
    }
}
