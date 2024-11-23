package com.kafka.guide.springboot_kafka.controllers;

import com.kafka.guide.springboot_kafka.kafka.JsonKafkaProducer;
import com.kafka.guide.springboot_kafka.models.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer jsonKafkaProducer;
    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping()
    public ResponseEntity<String> sendMessage(@RequestBody UserModel userModel) {
        try {
            jsonKafkaProducer.sendMessage(userModel);
            return ResponseEntity.ok("Success");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
