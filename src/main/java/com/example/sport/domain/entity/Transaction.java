package com.example.sport.domain.entity;

import java.time.LocalDateTime;

public class Transaction {
    private Long id;
    private String describe;
    private Integer price;
    private Integer fun;
    private LocalDateTime date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getFun() {
        return fun;
    }

    public void setFun(Integer fun) {
        this.fun = fun;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Transaction() {
    }

    public Transaction(Long id, String describe, Integer price, Integer fun, LocalDateTime date) {
        this.id = id;
        this.describe = describe;
        this.price = price;
        this.fun = fun;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", describe='" + describe + '\'' +
                ", price=" + price +
                ", fun=" + fun +
                ", date=" + date +
                '}';
    }
}
