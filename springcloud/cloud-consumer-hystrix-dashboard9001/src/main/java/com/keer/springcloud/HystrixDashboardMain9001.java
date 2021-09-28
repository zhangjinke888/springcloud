package com.keer.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Auther ker
 * @Date 2021/9/1
 * @ApiNode
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
 public static void main(String[] args) {
       SpringApplication.run(HystrixDashboardMain9001.class, args);
  }

}
