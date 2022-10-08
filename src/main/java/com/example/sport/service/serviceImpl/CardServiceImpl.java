package com.example.sport.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sport.domain.entity.Card;
import com.example.sport.mapper.CardMapper;
import com.example.sport.service.CardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CardServiceImpl extends ServiceImpl<CardMapper, Card> implements CardService {

    @Resource
    CardMapper cardMapper;

    @Override
    public List<Card> getAll(Card card) {
        return cardMapper.getCards(card);
    }

    @Override
    public Card get(String phone) {
        return cardMapper.getCard(phone);
    }

    @Override
    public boolean add(Card card) {
        return cardMapper.addOne(card) >= 1;
    }

    @Override
    public boolean delete(String account) {
        return cardMapper.deleteOne(account) >= 1;
    }
}
