package com.currency.notification.controller;


import com.currency.notification.DTO.CurrencyAlertRequest;
import com.currency.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.core.Authentication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notify")
public class Controller {

    @Autowired
    NotificationService notificationService;


    @PostMapping
    public ResponseEntity<?> createNotification(@RequestBody CurrencyAlertRequest request) {
        Long id = notificationService.saveAlert(request);
        return ResponseEntity.ok("Alert created successfully created with id:" + id.toString());
    }


    @GetMapping("/check")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> healthCheck() {
        return ResponseEntity.ok("Service is Up!!");
    }



}
