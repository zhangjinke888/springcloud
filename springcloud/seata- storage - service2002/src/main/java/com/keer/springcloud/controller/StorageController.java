package com.keer.springcloud.controller;

import com.keer.springcloud.domain.CommonResult;
import com.keer.springcloud.service.StorageService;
import com.keer.springcloud.service.StorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther ker
 * @Date 2021/10/14
 * @ApiNode
 */
@RestController
public class StorageController {

    @Autowired
    private StorageServiceImpl storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }

}
