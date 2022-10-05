package com.example.sport.controller;

import com.example.sport.domain.entity.User;
import com.example.sport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
            @PostMapping("/getAll")
    public List<User>  getAllById(@RequestBody User user){

                return userService.getAllById(user);
            }
}
