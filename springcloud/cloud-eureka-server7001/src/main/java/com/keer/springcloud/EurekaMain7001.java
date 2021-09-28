package com.keer.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther ker
 * @Date 2021/8/18
 * @ApiNode
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
     public static void main(String[] args) {
           SpringApplication.run(EurekaMain7001.class, args);
      }
}
