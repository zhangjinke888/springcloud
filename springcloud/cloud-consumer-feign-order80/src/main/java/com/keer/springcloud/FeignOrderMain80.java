package com.keer.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther ker
 * @Date 2021/8/30
 * @ApiNode
 */
@SpringBootApplication
@EnableFeignClients
public class FeignOrderMain80 {
     public static void main(String[] args) {
           SpringApplication.run(FeignOrderMain80.class, args);
      }
}
