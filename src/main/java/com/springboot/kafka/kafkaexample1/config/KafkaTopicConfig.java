package com.springboot.kafka.kafkaexample1.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/*********************************************************
 * This class is basically used to configure the topic
 * NewTopic gives the names of the topic
 * Topic is build using the properties given in the
 * application.properties file
 ********************************************************/
@Configuration
public class KafkaTopicConfig {


    @Bean
    public NewTopic javaguidesTopic()
    {
        return TopicBuilder.name("javaguides").build();
    }
}
