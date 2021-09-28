package com.keer.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Auther ker
 * @Date 2021/8/29
 * @ApiNode
 */
@RestController
public class ConsulPaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("payment/consul")
    public String paymentConsul(){
        return "paymentConsul:"+serverPort+ UUID.randomUUID();
    }
}
