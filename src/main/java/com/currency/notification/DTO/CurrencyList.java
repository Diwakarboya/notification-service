package com.currency.notification.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyList implements Serializable {
    private int amount;

    private String base;

    private String date;

    private Map<String,Double> rates;

}
