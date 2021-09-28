package com.keer.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;

/**
 * @auther keer
 * @data 2021/9/1
 * @description
 */
@Service
public class HystrixService {

    public String payment_Ok(Integer id){
        return "线程池："+Thread.currentThread().getName()+"payment："+id;
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_time_Handler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String payment_Sleep(Integer id){
        int timeout = 2;
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"paymentSleep："+id;
    }
    private String paymentInfo_time_Handler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"====>provider8001:服务器异常";
    }
}
