package com.example.sport.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sport.domain.entity.Coach;
import com.example.sport.mapper.CoachMapper;
import com.example.sport.service.CoachService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CoachServiceIMpl extends ServiceImpl<CoachMapper, Coach> implements CoachService {

    @Resource
    CoachMapper coachMapper;

    @Override
    public List<Coach> getAll(Coach coach) {
        return coachMapper.getCoachs(coach);
    }

    @Override
    public Coach get(String account) {
        return coachMapper.getCoach(account);
    }

    @Override
    public boolean add(Coach coach) {
        coachMapper.addOne(coach);
        return true;
    }

    @Override
    public boolean delete(String account) {
        coachMapper.deleteOne(account);
        return true;
    }
}
