package com.keer.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.keer.springcloud.entities.CommonResult;

/**
 * @auther keer
 * @data 2021/9/29
 * @description
 */

public class CustomerblockHandler {

    public static CommonResult blockHandlerResult1(BlockException e){
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult blockHandlerResult2(BlockException e){
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }

}
