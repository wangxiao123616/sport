package com.example.sport.controller;

import com.example.sport.domain.entity.Manager;
import com.example.sport.service.ManagerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerConrtoller {

    @Resource
    ManagerService managerService;

    @GetMapping("/getAll")
    public List<Manager> getAll(Manager manager) {
        return managerService.getAll(manager);
    }

    @GetMapping("/get/{account}")
    public Manager get(@PathVariable("account") String account) {
        return managerService.get(account);
    }

    @PostMapping("/add")
    public boolean add(Manager manager) {
        return managerService.add(manager);
    }

    @DeleteMapping("/delete/{account}")
    public boolean delete(@PathVariable("account") String account) {
        return managerService.delete(account);
    }

}
