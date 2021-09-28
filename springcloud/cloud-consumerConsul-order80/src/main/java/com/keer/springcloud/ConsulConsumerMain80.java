package com.keer.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther ker
 * @Date 2021/8/29
 * @ApiNode
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulConsumerMain80 {
     public static void main(String[] args) {
           SpringApplication.run(ConsulConsumerMain80.class, args);
      }
}
