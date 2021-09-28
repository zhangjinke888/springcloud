package com.keer.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther ker
 * @Date 2021/9/26
 * @ApiNode
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain83 {
     public static void main(String[] args) {
           SpringApplication.run(OrderMain83.class, args);
      }
}
