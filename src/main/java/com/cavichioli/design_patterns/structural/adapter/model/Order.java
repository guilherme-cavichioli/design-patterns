package com.cavichioli.design_patterns.structural.adapter.model;

import lombok.Getter;

@Getter
public class Order {
    private Long id;
    private String description;
    private double value;

    private Order(OrderBuilder builder) {
        this.id = builder.id;
        this.description = builder.description;
        this.value = builder.value;
    }

    public static class OrderBuilder {
        private Long id;
        private String description;
        private double value;

        public OrderBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public OrderBuilder description(String description) {
            this.description = description;
            return this;
        }

        public OrderBuilder value(double value) {
            this.value = value;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    @Override
    public String toString() {
        return "Order{id=" + id + ", description='" + description + "', value='" + value + "'}";
    }
}
