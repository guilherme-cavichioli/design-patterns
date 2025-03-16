package com.cavichioli.design_patterns.behavior.strategy;


import com.cavichioli.design_patterns.behavior.strategy.model.Order;
import com.cavichioli.design_patterns.behavior.strategy.model.enums.PaymentTypeEnum;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentStrategy {

    @Override
    public boolean hasType(Order order) {
        var hasPayment = order.getPayments()
                .stream().filter(payment -> PaymentTypeEnum.CREDIT_CARD.equals(payment.getType()))
                .findFirst();

        return hasPayment.isPresent();
    }

    @Override
    public void pay(Order order) {
        System.out.printf("Paying order %s with credit card", order.getId());
    }
}
