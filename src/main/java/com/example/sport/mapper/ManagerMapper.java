package com.example.sport.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sport.domain.entity.Manager;

import java.util.List;

public interface ManagerMapper extends BaseMapper<Manager> {

    List<Manager> getManagers(Manager manager);

    Manager getManager(String account);

    int addOne(Manager manager);

    int deleteOne(String account);

}
