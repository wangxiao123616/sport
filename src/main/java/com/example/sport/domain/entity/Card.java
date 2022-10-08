package com.example.sport.domain.entity;

import java.time.LocalDateTime;

public class Card {
    private Long id;
    private Integer money;
    private String cPassword;
    private String phone;
    private LocalDateTime date;

    public Card() {
    }

    public Card(Long id, Integer money, String cPassword, String phone, LocalDateTime date) {
        this.id = id;
        this.money = money;
        this.cPassword = cPassword;
        this.phone = phone;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", money=" + money +
                ", cPassword='" + cPassword + '\'' +
                ", phone='" + phone + '\'' +
                ", date=" + date +
                '}';
    }
}
