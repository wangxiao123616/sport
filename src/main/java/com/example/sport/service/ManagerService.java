package com.example.sport.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sport.domain.entity.Manager;

import java.util.List;

public interface ManagerService extends IService<Manager> {
    List<Manager> getAll(Manager manager);

    Manager get(String account);

    boolean add(Manager manager);

    boolean delete(String account);
}
