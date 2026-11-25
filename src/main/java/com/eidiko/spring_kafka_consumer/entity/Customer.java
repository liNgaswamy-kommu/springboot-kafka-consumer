package com.eidiko.spring_kafka_consumer.entity;

import lombok.Data;

@Data
public class Customer {
    private int id;
    private String name;
    private String email;
}

