package com.cavichioli.design_patterns.behavior.observer.model;

import com.cavichioli.design_patterns.behavior.observer.EmailNotification;
import com.cavichioli.design_patterns.behavior.observer.OrderObserver;
import com.cavichioli.design_patterns.behavior.observer.SMSNotification;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private Long id;
    private String description;
    private String value;
    private String status;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(Long id, String description, String value) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.status = "CREATED";
        this.addObserver(new EmailNotification());
        this.addObserver(new SMSNotification());
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public String toString() {
        return "Order{id=" + id + ", description='" + description + "', value='" + value + "', status='" + status + "'}";
    }
}
