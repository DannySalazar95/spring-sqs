package com.dannysn.springsqs.config.sqs;

import io.awspring.cloud.sqs.annotation.SqsListener;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SqsConsumer {

    private final Logger log = LoggerFactory.getLogger(SqsConsumer.class);

    @SqsListener(value = "reviewTravelRequest")
    public void reviewTravelRequestEvent(String travelId) {

        log.info(">>> message=Received review travel request event, travel-id={}", travelId);
    }
}