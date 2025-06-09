package com.currency.notification.repository;

import com.currency.notification.entity.CurrencyAlertEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyAlertRepository extends JpaRepository<CurrencyAlertEntity,Long> {
}
