package com.kafka.cabdriver.service;

import com.kafka.cabdriver.constant.KafkaConstant;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CabDriverLocationServiceImpl implements CabDriverLocationService{

    private final KafkaTemplate<String, Object> kafkaTemplate;
    @Override
    public boolean updateLocation(String location) {
        kafkaTemplate.send(KafkaConstant.CAB_LOCATION, location);
        return false;
    }
}
