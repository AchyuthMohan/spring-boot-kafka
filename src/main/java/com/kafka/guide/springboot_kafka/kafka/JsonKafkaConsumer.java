package com.kafka.guide.springboot_kafka.kafka;

import com.kafka.guide.springboot_kafka.models.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "testTopic", groupId = "myGroup")
    public void consume(UserModel user) {
        LOGGER.info("Message received: {}", user);
    }
}
