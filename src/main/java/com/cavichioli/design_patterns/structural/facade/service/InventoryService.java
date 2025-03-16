package com.cavichioli.design_patterns.structural.facade.service;

import com.cavichioli.design_patterns.structural.facade.model.Order;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    public boolean checkStock(Order order) {
        System.out.println("Checking inventory for order: " + order.getId());
        return true;
    }
}
