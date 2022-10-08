package com.example.sport.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sport.domain.entity.Notice;
import com.example.sport.mapper.NoticeMapper;
import com.example.sport.service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements NoticeService {

    @Resource
    NoticeMapper noticeMapper;

    @Override
    public List<Notice> getAll(Notice notice) {
        return noticeMapper.getNotices(notice);
    }

    @Override
    public Notice get(Long id) {
        return noticeMapper.getNotice(id);
    }

    @Override
    public boolean add(Notice notice) {
        return noticeMapper.addOne(notice) >= 1;
    }

    @Override
    public boolean delete(Long id) {
        return noticeMapper.deleteOne(id) >= 1;
    }
}
