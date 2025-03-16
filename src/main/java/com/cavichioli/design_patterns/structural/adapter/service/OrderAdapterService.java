package com.cavichioli.design_patterns.structural.adapter.service;

import com.cavichioli.design_patterns.structural.adapter.PaymentAdapter;
import com.cavichioli.design_patterns.structural.adapter.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderAdapterService {

    private final PaymentAdapter paymentAdapter;

    public void payOrder() {
        Order order = new Order.OrderBuilder().id(123L).value(100.0).build();
        paymentAdapter.pay(order);
    }
}
