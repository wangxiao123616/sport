package com.example.sport.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Transaction {
    private Long id;
    private String describe;
    private Integer price;
    private Integer fun;
    private LocalDateTime date;
}
