package com.example.sport.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sport.domain.entity.PackageDetail;
import com.example.sport.mapper.PackageDetailMapper;
import com.example.sport.service.PackageDetailService;
import org.springframework.stereotype.Service;



@Service
public class PackageDetailServiceImpl extends  ServiceImpl<PackageDetailMapper, PackageDetail> implements  PackageDetailService{

}