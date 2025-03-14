package com.cavichioli.design_patterns.creational.builder.service;

import com.cavichioli.design_patterns.creational.builder.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderBuilderService {

    public void createOrder() {
        Order order = new Order.OrderBuilder()
                .id(1L)
                .description("Order description")
                .value("100.00")
                .build();

        System.out.println(order);
    }
}
