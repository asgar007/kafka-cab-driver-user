package com.kafka.cabuser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @KafkaListener(topics = "cab-location-1", groupId = "user-group")
    public void cabLocation(String location){
        System.out.println(location);
    }
}
