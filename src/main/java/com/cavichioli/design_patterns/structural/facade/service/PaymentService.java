package com.cavichioli.design_patterns.structural.facade.service;

import com.cavichioli.design_patterns.structural.facade.model.Order;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public boolean processPayment(Order order) {
        System.out.println("Processing payment for order: " + order.getId());
        return true;
    }
}
