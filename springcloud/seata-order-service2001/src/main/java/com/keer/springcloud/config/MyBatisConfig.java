package com.keer.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther ker
 * @Date 2021/10/16
 * @ApiNode
 */
@Configuration
@MapperScan({"com.keer.springcloud.dao"})
public class MyBatisConfig {

}
