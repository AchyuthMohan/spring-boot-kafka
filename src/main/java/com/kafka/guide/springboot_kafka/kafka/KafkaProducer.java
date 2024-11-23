//package com.kafka.guide.springboot_kafka.kafka;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//import static com.kafka.guide.springboot_kafka.common.KafkaTopicName.TEST_TOPIC;
//
//@Service
//public class KafkaProducer {
//    public static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
//    private KafkaTemplate<String,String> kafkaTemplate;
//
//    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendMessage(String message){
//        LOGGER.info("message={}",message);
//        kafkaTemplate.send(TEST_TOPIC.toString(),message);
//    }
//}
