package com.lhx.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.lhx.mall.mbg.mapper","com.lhx.mall.dao"})
public class MyBatisConfig {
}
