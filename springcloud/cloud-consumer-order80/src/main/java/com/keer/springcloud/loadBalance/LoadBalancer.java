package com.keer.springcloud.loadBalance;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @auther keer
 * @data 2021/8/30
 * @description
 */
public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
