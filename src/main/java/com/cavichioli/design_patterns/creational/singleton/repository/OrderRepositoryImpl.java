package com.cavichioli.design_patterns.creational.singleton.repository;

import com.cavichioli.design_patterns.creational.singleton.config.DatabaseConnection;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    DatabaseConnection db = DatabaseConnection.getInstance();

    public void saveOrder() {
        db.connect();
        System.out.println("Order saved!");
    }

    public void deleteOrder() {
        db.connect();
        System.out.println("Order deleted!");
    }

    public void updateOrder() {
        db.connect();
        System.out.println("Order updated!");
    }

    public void findOrder() {
        db.connect();
        System.out.println("Order found!");
    }
}
