package com.keer.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.keer.springcloud.entities.CommonResult;
import com.keer.springcloud.entities.Payment;
import com.keer.springcloud.myHandler.CustomerblockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther keer
 * @data 2021/9/29
 * @description
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "block")
    public CommonResult byResource(){
        return  new CommonResult(200,"按资源名称限流测试OK",new Payment(2020L,"serial001"));
    }
    public CommonResult block(BlockException exception){
        return  new CommonResult(444,exception.getClass().getCanonicalName()+"\t 服务不可用");
    }

    @GetMapping("/byResource11")
    @SentinelResource(value ="byResource11",blockHandlerClass = CustomerblockHandler.class,blockHandler = "blockHandlerResult1")
    public CommonResult byResource11(){
        return  new CommonResult(200,"按资源名称限流测试OK",new Payment(2020L,"serial001"));
    }

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerblockHandler.class,//<-------- 自定义限流处理类
            blockHandler = "blockHandlerResult2")//<-----------
    public CommonResult customerBlockHandler()
    {
        return new CommonResult(200,"按客戶自定义",new Payment(2020L,"serial003"));
    }

}
