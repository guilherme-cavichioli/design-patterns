package com.cavichioli.design_patterns.behavior.observer;

import com.cavichioli.design_patterns.behavior.observer.model.Order;

public class SMSNotification implements OrderObserver {

    @Override
    public void update(Order order) {
        System.out.printf("Sending SMS notification for order: %s, status: %s%n", order.getId(), order.getStatus());
    }
}
