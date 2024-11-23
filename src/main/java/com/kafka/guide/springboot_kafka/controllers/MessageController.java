//package com.kafka.guide.springboot_kafka.controllers;
//
//import com.kafka.guide.springboot_kafka.kafka.KafkaProducer;
//import com.kafka.guide.springboot_kafka.models.SendMessageRequestModel;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/v1/kafka")
//public class MessageController {
//
//    private final KafkaProducer producer;
//
//    public MessageController(KafkaProducer producer) {
//        this.producer = producer;
//    }
//
//    @PostMapping()
//    public ResponseEntity<String> sendMessage(@RequestBody SendMessageRequestModel requestModel) {
//        try {
//            producer.sendMessage(requestModel.getMessage());
//            return ResponseEntity.ok("Success");
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request: " + e.getMessage());
//        }
//    }
//}
