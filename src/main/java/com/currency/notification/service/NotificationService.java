package com.currency.notification.service;

import com.currency.notification.DTO.CurrencyAlertRequest;
import com.currency.notification.entity.CurrencyAlertEntity;
import com.currency.notification.repository.CurrencyAlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    private CurrencyAlertRepository currencyAlertRepository;


    public Long saveAlert(CurrencyAlertRequest alertRequest){
        CurrencyAlertEntity currencyAlertEntity = new CurrencyAlertEntity();
        currencyAlertEntity.setEmail(alertRequest.getEmail());
        currencyAlertEntity.setCurrency2(alertRequest.getCurrency2());
        currencyAlertEntity.setCurrency1(alertRequest.getCurrency1());
        currencyAlertEntity.setThreshold(alertRequest.getThreshold());
        currencyAlertEntity.setNotifyOnDrop(alertRequest.isNotifyOnDrop());
        CurrencyAlertEntity alert = currencyAlertRepository.save(currencyAlertEntity);
        return alert.getId();


    }
}
