package com.keer.springcloud.controller;

import com.keer.springcloud.service.HystrixService;
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
public class HystrixController {
    @Autowired
    HystrixService paymentService;
    /**
     * 正常访问
     * @param id
     * @return
     */
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String result=paymentService.payment_Ok(id);
        log.info("*******result:" +result);
        return  result;
    }

    /**
     * 超时
     * @param id
     * @return
     */

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_time(@PathVariable("id") Integer id){
        String result=paymentService.payment_Sleep(id);
        log.info("*******result:" +result);
        return  result;
    }



}
