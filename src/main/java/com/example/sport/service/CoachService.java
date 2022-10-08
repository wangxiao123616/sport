package com.example.sport.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sport.domain.entity.Coach;

import java.util.List;

public interface CoachService extends IService<Coach> {
    List<Coach> getAll(Coach coach);

    Coach get(String account);

    boolean add(Coach coach);

    boolean delete(String account);
}
