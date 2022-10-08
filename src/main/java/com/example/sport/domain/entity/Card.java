package com.example.sport.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Card {
    private Long id;
    private Integer money;
    private String cPassword;
    private String phone;
    private LocalDateTime date;
}
