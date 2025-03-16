package com.cavichioli.design_patterns.structural.facade.service;

import com.cavichioli.design_patterns.structural.facade.model.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public void shipOrder(Order order) {
        System.out.println("Shipping order: " + order.getId());
    }
}
