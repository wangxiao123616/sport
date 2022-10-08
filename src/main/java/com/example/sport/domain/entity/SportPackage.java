package com.example.sport.domain.entity;

import lombok.Data;

@Data
public class SportPackage {
    private Long id;
    private String pName;
    private Integer price;
    private String describe;
    private Integer count;
}
