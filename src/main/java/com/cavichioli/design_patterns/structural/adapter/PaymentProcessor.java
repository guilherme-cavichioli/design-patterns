package com.cavichioli.design_patterns.structural.adapter;

import com.cavichioli.design_patterns.structural.adapter.model.Order;

public interface PaymentProcessor {
    void pay(Order order);
}
