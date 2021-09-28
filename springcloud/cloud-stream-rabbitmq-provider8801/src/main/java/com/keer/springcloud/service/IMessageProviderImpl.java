package com.keer.springcloud.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @Auther ker
 * @Date 2021/9/23
 * @ApiNode
 */
@EnableBinding(Source.class)
public class IMessageProviderImpl implements IMessageProvider {
    @Autowired
    private MessageChannel output;
    @Override
    public String send() {
        String uuid = java.util.UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uuid).build());
        System.out.println(uuid);
        return uuid;
    }
}
