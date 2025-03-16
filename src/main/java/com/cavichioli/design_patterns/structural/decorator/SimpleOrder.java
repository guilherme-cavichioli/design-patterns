package com.cavichioli.design_patterns.structural.decorator;

public class SimpleOrder implements Order {


    @Override
    public String getDescription() {
        return "Order finished";
    }

    @Override
    public double getValue(double value, double discount) {
        return value;
    }
}
