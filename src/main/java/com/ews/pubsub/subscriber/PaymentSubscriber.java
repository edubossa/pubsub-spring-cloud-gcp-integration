package com.ews.pubsub.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class PaymentSubscriber {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentSubscriber.class);

    @ServiceActivator(inputChannel = "paymentInputChannel")
    public void messageReceiver(String payload) {
        LOGGER.info("Message arrived! Payload: " + payload);
    }

}
