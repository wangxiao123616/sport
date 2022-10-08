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
        cardMapper.getCards(card);
        return null;
    }

    @Override
    public Card get(String phone) {
        return cardMapper.getCard(phone);
    }

    @Override
    public boolean add(Card card) {
        cardMapper.addOne(card);
        return true;
    }

    @Override
    public boolean delete(String account) {
        cardMapper.deleteOne(account);
        return true;
    }
}
