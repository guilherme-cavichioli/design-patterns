package com.cavichioli.design_patterns.behavior.strategy.service;

import com.cavichioli.design_patterns.behavior.strategy.PaymentStrategy;
import com.cavichioli.design_patterns.behavior.strategy.model.Order;
import com.cavichioli.design_patterns.behavior.strategy.model.Payment;
import com.cavichioli.design_patterns.behavior.strategy.model.enums.PaymentTypeEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderStrategyService {

    private final List<PaymentStrategy> paymentStrategies;

    public void payOrder() {
        Order order = new Order();
        order.setId(1L);
        order.setDescription("Laptop");
        order.setValue("1500");

        Payment payment = new Payment();
        payment.setId(1L);
        payment.setType(PaymentTypeEnum.PAYPAL);
        payment.setCreatedAt(LocalDateTime.now());

        order.setPayments(List.of(payment));

        paymentStrategies.forEach(paymentStrategy -> {
            if (paymentStrategy.hasType(order)) {
                paymentStrategy.pay(order);
            }
        });
    }
}
