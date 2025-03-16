package com.cavichioli.design_patterns.structural.decorator;

public class CouponDecorator extends OrderDecorator {

    public CouponDecorator(Order order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return decoretedOrder.getDescription() + " - Coupon applied";
    }

    @Override
    public double getValue(double value, double discount) {
        double orderValue = decoretedOrder.getValue(value, discount);
        return orderValue - (orderValue * discount);
    }
}
