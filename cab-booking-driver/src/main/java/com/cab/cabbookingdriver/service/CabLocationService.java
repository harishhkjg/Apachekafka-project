package com.cab.cabbookingdriver.service;


import com.cab.cabbookingdriver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService
{

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate ;
    public boolean updateLocation (String location)
    {
        kafkaTemplate.send(AppConstant.cabLocation,location);
        return  true;
    }

}
