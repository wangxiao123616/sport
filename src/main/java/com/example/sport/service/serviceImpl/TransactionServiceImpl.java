package com.example.sport.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sport.domain.entity.Transaction;
import com.example.sport.mapper.TransactionMapper;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl extends ServiceImpl<TransactionMapper, Transaction> {
}
