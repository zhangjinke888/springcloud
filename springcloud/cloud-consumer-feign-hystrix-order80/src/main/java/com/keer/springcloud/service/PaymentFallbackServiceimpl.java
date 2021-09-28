package com.keer.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Auther ker
 * @Date 2021/9/1
 * @ApiNode
 */
@Component
public class PaymentFallbackServiceimpl implements PaymentHystrixService{
    @Override
    public String paymentInfo_ok(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_time(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
