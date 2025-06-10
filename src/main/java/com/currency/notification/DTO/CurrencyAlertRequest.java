package com.currency.notification.DTO;

import lombok.Data;

@Data
public class CurrencyAlertRequest {
    private String currency1;
    private String email;
    private String currency2;
    private double threshold;
    private boolean notifyOnDrop;
}
