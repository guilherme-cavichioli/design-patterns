package com.cavichioli.design_patterns.creational.singleton.config;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database Connection Established.");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }
}