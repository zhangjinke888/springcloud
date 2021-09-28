package com.keer.springcloud.controller;

import com.keer.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther keer
 * @data 2021/9/1
 * @description
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "global_fallBackMethod")
public class OrderHystrixController {

    @Autowired
    PaymentHystrixService paymentHystrixService;

//    @HystrixCommand(fallbackMethod = "paymentInfo_fallBackMethod",commandProperties = {
//        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    @HystrixCommand
    @GetMapping("/comsumer/payment/hystrix/ok/{id}")
    String paymentInfo_ok(@PathVariable("id") Integer id){
        String s = paymentHystrixService.paymentInfo_ok(id);
        return s;
    }

//    @HystrixCommand(fallbackMethod = "paymentInfo_fallBackMethod",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//    })
    @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    String paymentInfo_time(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_time(id);
    }

//    private String paymentInfo_fallBackMethod(@PathVariable("id") Integer id){
//        return "comsumer80：服务器错误，请重试";
//    }
    private String global_fallBackMethod(){
        return "全局服务器错误，请重试";
    }

}
