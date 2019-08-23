package com.ews.pubsub.controller;

import com.ews.pubsub.publisher.PaymentPublishGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {

    @Autowired
    private PaymentPublishGateway publishGateway;

    @GetMapping(value = "/message")
    String  publishMessage() {
        final String message = UUID.randomUUID().toString();
        this.publishGateway.sendToPubsub(message);
        return message;
    }

}
