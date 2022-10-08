package com.example.sport.domain.entity;

import java.time.LocalDateTime;

public class Notice {
    private Long id;
    private String nTitle;
    private LocalDateTime date;
    private String name;
    private String describe;

    public Notice() {
    }

    public Notice(Long id, String nTitle, LocalDateTime date, String name, String describe) {
        this.id = id;
        this.nTitle = nTitle;
        this.date = date;
        this.name = name;
        this.describe = describe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", nTitle='" + nTitle + '\'' +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
