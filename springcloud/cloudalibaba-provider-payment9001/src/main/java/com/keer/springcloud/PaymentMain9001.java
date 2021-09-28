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
public class PaymentMain9001 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain9001.class, args);
      }

}
