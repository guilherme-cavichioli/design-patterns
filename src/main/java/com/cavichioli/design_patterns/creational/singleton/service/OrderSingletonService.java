package com.cavichioli.design_patterns.creational.singleton.service;

import com.cavichioli.design_patterns.creational.singleton.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderSingletonService {

    @Autowired
    private OrderRepository orderRepository;

    public void saveOrder() {
        orderRepository.saveOrder();
    }

    public void deleteOrder() {
        orderRepository.deleteOrder();
    }

    public void updateOrder() {
        orderRepository.updateOrder();
    }

    public void findOrder() {
        orderRepository.findOrder();
    }
}
