package com.keer.springcloud.controller;

import com.keer.springcloud.entities.CommonResult;
import com.keer.springcloud.entities.Payment;
import com.keer.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther ker
 * @Date 2021/8/30
 * @ApiNode
 */
@RestController
public class FeignOrderController {
    @Autowired
    PaymentFeignService paymentFeignService;
    @RequestMapping("/feign/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return  paymentFeignService.getPaymentById(id);
    }
    @GetMapping(value = "/fegin/thread/sleep")
    public String threadSleep(){
        return paymentFeignService.threadSleep();
    }
}
