package com.cavichioli.design_patterns.behavior.observer;

import com.cavichioli.design_patterns.behavior.observer.model.Order;

public interface OrderObserver {

    void update(Order order);
}
