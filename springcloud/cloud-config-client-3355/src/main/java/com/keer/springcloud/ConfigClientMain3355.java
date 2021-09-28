package com.keer.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther ker
 * @Date 2021/9/22
 * @ApiNode
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3355 {
     public static void main(String[] args) {
           SpringApplication.run(ConfigClientMain3355.class, args);
      }
}
