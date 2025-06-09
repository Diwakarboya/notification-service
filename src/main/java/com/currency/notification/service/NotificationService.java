package com.currency.notification.service;

import com.currency.notification.entity.CurrencyAlertEntity;
import com.currency.notification.repository.CurrencyAlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    private CurrencyAlertRepository currencyAlertRepository;


    public void saveAlert(CurrencyAlert alert){

    }
}
