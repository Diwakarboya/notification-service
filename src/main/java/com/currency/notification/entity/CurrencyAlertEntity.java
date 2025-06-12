package com.currency.notification.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="currency_threshold")
public class CurrencyAlertEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String currency1;

    @Column(nullable = false)
    private String currency2;

    @Column(nullable = false)
    private double threshold;

    @Column(nullable = false)
    private boolean notifyOnDrop;


}
