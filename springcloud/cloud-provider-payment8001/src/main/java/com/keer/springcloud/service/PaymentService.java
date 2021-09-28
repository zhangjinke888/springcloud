package com.keer.springcloud.service;

import com.keer.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @Auther ker
 * @Date 2021/8/17
 * @ApiNode
 */

public interface PaymentService {
     int create(Payment payment);
     Payment getPaymentById(@Param("id") Long id);
}
