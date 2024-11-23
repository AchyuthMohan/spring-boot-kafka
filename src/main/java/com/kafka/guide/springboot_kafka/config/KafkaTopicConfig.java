package com.kafka.guide.springboot_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.kafka.guide.springboot_kafka.common.KafkaTopicName.TEST_TOPIC;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic testTopic(){
        return TopicBuilder.name(TEST_TOPIC.toString())
                .partitions(10)
                .build();
    }
}
