package com.keer.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther ker
 * @Date 2021/8/29
 * @ApiNode
 */
@RestController
@Slf4j
public class OrderZkController {
    public static final String URL ="http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("comsumer/payment/zk")
    public String paymentInfo(){
        String forObject = restTemplate.getForObject(URL + "/payment/zk", String.class);
        return forObject;
    }
}
