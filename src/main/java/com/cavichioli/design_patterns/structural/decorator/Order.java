package com.cavichioli.design_patterns.structural.decorator;

public interface Order {

    String getDescription();
    double getValue(double value, double discount);
}
