package com.example.sport.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sport.domain.entity.User;

import java.util.List;

public interface UserService  extends IService<User> {
    List<User> getAllById(User user);
}
