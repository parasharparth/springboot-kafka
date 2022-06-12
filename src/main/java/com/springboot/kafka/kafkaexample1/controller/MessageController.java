package com.springboot.kafka.kafkaexample1.controller;

import com.springboot.kafka.kafkaexample1.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer)
    {
        this.kafkaProducer = kafkaProducer;
    }
}
