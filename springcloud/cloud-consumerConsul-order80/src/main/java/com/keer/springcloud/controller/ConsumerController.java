package com.keer.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther ker
 * @Date 2021/8/29
 * @ApiNode
 */
@RestController
public class ConsumerController {
    public static final String URL = "http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("a")
    public String Consumer(){
        return restTemplate.getForObject(URL+"/payment/consul",String.class);
    }
}
