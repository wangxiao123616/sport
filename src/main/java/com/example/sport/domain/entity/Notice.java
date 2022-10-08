package com.example.sport.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Notice {
    private Long id;
    private String nTitle;
    private LocalDateTime date;
    private String name;
    private String describe;
}
