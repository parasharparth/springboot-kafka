package com.springboot.kafka.kafkaexample1.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.Map;

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

    @Bean
    public ProducerFactory<String, ?> wildcardProducerFactory(){
        Map<String, Object> config = null;
        return new DefaultKafkaProducerFactory<>(config, new StringSerializer(), new JsonSerializer<>());
    }

    // Variant: Define specific producer and template
    @Bean
    public ProducerFactory<String, String> fooProducerFactory(){
        Map<String, Object> config = null;
        return new DefaultKafkaProducerFactory(config, new StringSerializer(), new JsonSerializer());
    }

    @Bean
    public KafkaTemplate<String, String> fooKafkaTemplate(){
        return new KafkaTemplate<>(fooProducerFactory());
    }
}
