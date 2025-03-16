package com.cavichioli.design_patterns.structural.decorator;

public class DeliveryDecorator extends OrderDecorator {

    public DeliveryDecorator(Order order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return decoretedOrder.getDescription() + " - Delivery finished";
    }

    @Override
    public double getValue(double value, double discount) {
        return decoretedOrder.getValue(value, discount) + 15.00;
    }


}
