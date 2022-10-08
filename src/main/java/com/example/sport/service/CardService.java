package com.example.sport.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sport.domain.entity.Card;

import java.util.List;

public interface CardService extends IService<Card> {

    List<Card> getAll(Card card);

    Card get(String phone);

    boolean add(Card card);

    boolean delete(String account);
}
