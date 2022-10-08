package com.example.sport.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sport.domain.entity.Card;
import com.example.sport.domain.entity.Coach;

import java.util.List;

public interface CoachMapper extends BaseMapper<Coach> {

    List<Coach> getCoachs(Coach coach);

    Coach getCoach(String account);

    int addOne(Coach coach);

    int deleteOne(String account);

}
