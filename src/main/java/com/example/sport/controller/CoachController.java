package com.example.sport.controller;

import com.example.sport.domain.entity.Coach;
import com.example.sport.service.CoachService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/coach")
public class CoachController {

    @Resource
    CoachService coachService;

    @GetMapping("/getAll")
    public List<Coach> getAll(Coach coach) {
        return coachService.getAll(coach);
    }

    @GetMapping("/get/{account}")
    public Coach get(@PathVariable("account") String account) {
        return coachService.get(account);
    }

    @PostMapping("/add")
    public boolean add(Coach coach) {
        return coachService.add(coach);
    }

    @DeleteMapping("/delete/{account}")
    public boolean delete(@PathVariable("account") String account) {
        return coachService.delete(account);
    }

}
