package com.cab.cabbookingdriver.config;


import com.cab.cabbookingdriver.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.admin.TopicDescription;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {


    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(AppConstant.cabLocation).build();
    }
}
