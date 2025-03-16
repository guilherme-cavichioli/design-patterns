package com.cavichioli.design_patterns.structural.adapter;

import org.springframework.stereotype.Component;

@Component
public class ExternalPaymentGateway {
    public void processPayment(String orderId, String amount) {
        System.out.println("Processing payment of $" + amount + " for order ID: " + orderId + " via External Payment Gateway.");
    }
}
