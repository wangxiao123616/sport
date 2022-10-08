package com.example.sport.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sport.domain.entity.Card;

import java.util.List;

public interface CardMapper extends BaseMapper<Card> {

    List<Card> getCards(Card card);

    Card getCard(String phone);

    int addOne(Card card);

    Object deleteOne(String phone);

}
