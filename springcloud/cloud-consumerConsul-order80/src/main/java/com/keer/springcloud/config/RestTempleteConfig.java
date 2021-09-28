package com.keer.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther ker
 * @Date 2021/8/29
 * @ApiNode
 */
@Configuration
public class RestTempleteConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRest(){
        return new RestTemplate();
    }
}
