package com.example.sport.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sport.domain.entity.Notice;

import java.util.List;

public interface NoticeService extends IService<Notice> {
    List<Notice> getAll(Notice notice);

    Notice get(Long id);

    boolean add(Notice notice);

    boolean delete(Long id);
}
