package com.currency.notification.controller;


import com.currency.notification.DTO.CurrencyAlertRequest;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notify")
public class Controller {


    @PostMapping("/{userId}")
    public ResponseEntity<?> createNotification(@PathVariable Long userId,
                                                @RequestBody CurrencyAlertRequest request) {

        return ResponseEntity.ok("Alert created successfully.");
    }


    @GetMapping("/check")
    public ResponseEntity<?> healthCheck() {
        String hello = "new world";
        return ResponseEntity.ok("Service is Up!!");
    }

}
