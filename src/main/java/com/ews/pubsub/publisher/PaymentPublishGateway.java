package com.ews.pubsub.publisher;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.stereotype.Component;

@Component
@MessagingGateway(defaultRequestChannel = "paymentOutputChannel")
public interface PaymentPublishGateway {

    void sendToPubsub(String text);

}
