package com.example.sport.controller;

import com.example.sport.domain.entity.Card;
import com.example.sport.service.CardService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/card")
public class CardConrtoller {

    @Resource
    CardService cardService;

    @GetMapping("/getAll")
    public List<Card> getAll(Card card){
        return cardService.getAll(card);
    }

    @GetMapping("/get/{phone}")
    public Card get(@PathVariable("phone") String phone){
        return cardService.get(phone);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody Card card){
        return cardService.add(card);
    }

    @DeleteMapping("/delete/{account}")
    public boolean delete(@PathVariable("account") String account){
        return cardService.delete(account);
    }
}
