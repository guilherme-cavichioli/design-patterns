package com.cavichioli.design_patterns.behavior.observer.service;

import com.cavichioli.design_patterns.behavior.observer.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderObserverService {

    public void updateOrder() {
        Order order = new Order(1L, "Laptop", "1500");

        order.setStatus("SHIPPED");

        // Further status update
        order.setStatus("DELIVERED");
    }
}
