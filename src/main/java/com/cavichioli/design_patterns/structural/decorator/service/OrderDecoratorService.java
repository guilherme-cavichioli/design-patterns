package com.cavichioli.design_patterns.structural.decorator.service;

import com.cavichioli.design_patterns.structural.decorator.CouponDecorator;
import com.cavichioli.design_patterns.structural.decorator.DeliveryDecorator;
import com.cavichioli.design_patterns.structural.decorator.Order;
import com.cavichioli.design_patterns.structural.decorator.SimpleOrder;
import org.springframework.stereotype.Service;

@Service
public class OrderDecoratorService {

    public void createOrder() {
        Order order = new SimpleOrder();
        System.out.printf("Simple Order - Description: %s, Value: %s%n", order.getDescription(), order.getValue(100.00, 0.10));

        order = new DeliveryDecorator(order);
        System.out.printf("Order with Delivery - Description: %s, Value: %s%n", order.getDescription(), order.getValue(100.00, 0.10));

        order = new CouponDecorator(order);
        System.out.printf("Order with Coupon - Description: %s, Value: %s%n", order.getDescription(), order.getValue(100.00, 0.10));
    }
}
