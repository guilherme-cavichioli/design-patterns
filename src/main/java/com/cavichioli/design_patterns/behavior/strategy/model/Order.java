package com.cavichioli.design_patterns.behavior.strategy.model;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Long id;
    private String description;
    private String value;
    private List<Payment> payments;
}
