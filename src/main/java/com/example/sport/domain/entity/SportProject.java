package com.example.sport.domain.entity;

import lombok.Data;

@Data
public class SportProject {
    private Long id;
    private String pName;
    private Long cId;
    private Integer price;
    private String describe;
    private Integer count;
}
