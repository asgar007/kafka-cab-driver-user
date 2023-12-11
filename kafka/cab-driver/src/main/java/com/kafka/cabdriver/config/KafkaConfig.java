package com.kafka.cabdriver.config;

import com.kafka.cabdriver.constant.KafkaConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.Map;

@Configuration
public class KafkaConfig {

    @Bean
    public KafkaAdmin kafkaAdmin() {
        return new KafkaAdmin(Map.of("bootstrap.servers", "localhost:29092"));
    }

    @Bean
    public NewTopic newTopic(){
        return TopicBuilder
                .name(KafkaConstant.CAB_LOCATION)
                .build();
    }

}
