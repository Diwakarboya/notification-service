package com.currency.notification.service;

import com.currency.notification.DTO.CurrencyList;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {


    private final ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics="currency-rates" , groupId = "myGroup")
    public CurrencyList consumeMsg(String msg){
        CurrencyList currencyList = new CurrencyList();
        try{
            currencyList = objectMapper.readValue(msg, CurrencyList.class);
            return currencyList;

        } catch (Exception e){
            e.printStackTrace();
        }

        return currencyList;

    }


}
