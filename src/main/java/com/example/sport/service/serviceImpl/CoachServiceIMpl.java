package com.example.sport.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sport.domain.entity.Coach;
import com.example.sport.mapper.CoachMapper;
import com.example.sport.service.CoachService;
import org.springframework.stereotype.Service;

@Service
public class CoachServiceIMpl extends ServiceImpl<CoachMapper, Coach> implements CoachService {
}
