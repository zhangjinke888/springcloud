package com.keer.springcloud.service;

/**
 * @Auther ker
 * @Date 2021/10/14
 * @ApiNode
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
