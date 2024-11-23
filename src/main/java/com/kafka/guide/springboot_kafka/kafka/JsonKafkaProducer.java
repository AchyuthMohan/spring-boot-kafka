package com.kafka.guide.springboot_kafka.kafka;

import com.kafka.guide.springboot_kafka.exceptions.KafkaException;
import com.kafka.guide.springboot_kafka.models.UserModel;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);
    private KafkaTemplate<String, UserModel> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, UserModel> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(UserModel data) {
        try {
            Message<UserModel> message = MessageBuilder.withPayload(data)
                    .setHeader(KafkaHeaders.TOPIC,
                            "testTopic")
                    .build();
            kafkaTemplate.send(message);
            LOGGER.info("Message sent successfully: {}", data);
        } catch (Exception e) {
            throw new KafkaException("Failed to send message to Kafka topic: ", e);
        }

    }
}
