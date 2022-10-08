package com.example.sport.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sport.domain.entity.Notice;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface NoticeMapper extends BaseMapper<Notice> {
    List<Notice> getNotices(Notice notice);

    Notice getNotice(Long id);

    int addOne(Notice notice);

    int deleteOne(Long id);
}
