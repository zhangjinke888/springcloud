package com.keer.springcloud.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

/**
 * @Auther ker
 * @Date 2021/10/11
 * @ApiNode
 */
@Repository
public interface OrderDao {
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
