package com.example.sport.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sport.domain.entity.Manager;
import com.example.sport.mapper.CoachMapper;
import com.example.sport.mapper.ManagerMapper;
import com.example.sport.service.ManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerMapper, Manager> implements ManagerService {

    @Resource
    ManagerMapper managerMapper;

    @Override
    public List<Manager> getAll(Manager manager) {
        return managerMapper.getManagers(manager);
    }

    @Override
    public Manager get(String account) {
        return managerMapper.getManager(account);
    }

    @Override
    public boolean add(Manager manager) {
        return managerMapper.addOne(manager) >= 1;
    }

    @Override
    public boolean delete(String account) {
        return managerMapper.deleteOne(account) >= 1;
    }
}
