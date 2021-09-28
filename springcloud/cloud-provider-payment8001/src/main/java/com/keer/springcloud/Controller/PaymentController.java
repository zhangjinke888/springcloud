package com.keer.springcloud.Controller;

import com.keer.springcloud.entities.CommonResult;
import com.keer.springcloud.entities.Payment;
import com.keer.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Auther ker
 * @Date 2021/8/17
 * @ApiNode
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Autowired
    PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId()+instance.getHost()+instance.getPort()+instance.getUri());
        }
    return discoveryClient;
    }

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result > 0){
            return new CommonResult(200,"成功"+port,result);
        }else {
            return new CommonResult(444,"失败"+port);
        }
    }
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null){
            return new CommonResult<Payment>(200,"成功"+port,payment);
        }else {
            return new CommonResult(444,"失败"+port);
        }
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return port;
    }

    @GetMapping(value = "/thread/sleep")
    public String threadSleep()
    {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {

        }
        return port;
    }

}
