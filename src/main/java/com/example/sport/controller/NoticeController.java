package com.example.sport.controller;

import com.example.sport.domain.entity.Notice;
import com.example.sport.service.NoticeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Resource
    NoticeService noticeService;

    @GetMapping("/getAll")
    public List<Notice> getAll(Notice notice) {
        return noticeService.getAll(notice);
    }

    @GetMapping("/get/{id}")
    public Notice get(@PathVariable("id") Long id) {
        return noticeService.get(id);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody Notice notice) {
        return noticeService.add(notice);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return noticeService.delete(id);
    }

}
