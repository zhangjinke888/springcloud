package com.keer.springcloud.service;

import com.keer.springcloud.domain.Order;
import org.springframework.stereotype.Service;

/**
 * @auther keer
 * @data 2021/10/14
 * @description
 */

public interface OrderService {

    void create(Order order);

}
