package com.cavichioli.design_patterns.structural.adapter;

import com.cavichioli.design_patterns.structural.adapter.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentAdapter implements PaymentProcessor {

    @Autowired
    private ExternalPaymentGateway externalPaymentGateway;

    @Override
    public void pay(Order order) {
        String amount = Double.toString(order.getValue());
        System.out.println("Adapting order to call external payment gateway.");
        externalPaymentGateway.processPayment(order.getId().toString(), amount.toString());
    }
}
