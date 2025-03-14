package com.cavichioli.design_patterns.creational.singleton.repository;

public interface OrderRepository {

        void saveOrder();

        void deleteOrder();

        void updateOrder();

        void findOrder();
}
