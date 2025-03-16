package com.cavichioli.design_patterns.structural.decorator;

public abstract class OrderDecorator implements Order {
    protected Order decoretedOrder;

    public OrderDecorator(Order order) {
        this.decoretedOrder = order;
    }

    @Override
    public String getDescription() {
        return decoretedOrder.getDescription();
    }

    @Override
    public double getValue(double value, double discount) {
        return decoretedOrder.getValue(value, discount);
    }
}
