package com.keer.springcloud.domain;

import lombok.Data;

/**
 * @Auther ker
 * @Date 2021/10/14
 * @ApiNode
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}

