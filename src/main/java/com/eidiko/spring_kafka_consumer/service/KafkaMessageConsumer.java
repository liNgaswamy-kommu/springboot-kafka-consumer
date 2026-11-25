package com.eidiko.spring_kafka_consumer.service;

import com.eidiko.spring_kafka_consumer.entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageConsumer {

    Logger log = LoggerFactory.getLogger(KafkaMessageConsumer.class);

    @KafkaListener(topics = "spring-topic",
                   groupId = "spring-consumer-group")
    public void consumer1(String message){
        log.info("Consumer1 messages {}", message);
    }

    @KafkaListener(topics = "spring-topic",
            groupId = "kommu-consumer-group")
    public void consumer2(String message){
        log.info("Consumer2 messages {}", message);
    }

    @KafkaListener(topics = "spring-topic",
            groupId = "kommu-consumer-group")
    public void consumer3(String message){
        log.info("Consumer3 messages {}", message);
    }

    @KafkaListener(topics = "spring-topic",
            groupId = "kommu-consumer-group")
    public void consumer4(String message){
        log.info("Consumer4 messages {}", message);
    }

    @KafkaListener(topics = "customer-topic",
                    groupId = "customer-consumer-group")
    public void customerConsumer(Customer customer){
        log.info("{} : {}", customer.getName(), customer.getEmail());
    }

}
