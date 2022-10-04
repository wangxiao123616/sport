package com.example.sport.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sport.domain.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
