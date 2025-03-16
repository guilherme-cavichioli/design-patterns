package com.cavichioli.design_patterns.behavior.strategy;

import com.cavichioli.design_patterns.behavior.strategy.model.Order;

public interface PaymentStrategy {

    boolean hasType(Order order);
    void pay(Order order);
}