package com.cavichioli.design_patterns;

import com.cavichioli.design_patterns.creational.builder.service.OrderBuilderService;
import com.cavichioli.design_patterns.creational.singleton.service.OrderSingletonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication implements CommandLineRunner {

	@Autowired
	OrderSingletonService orderSingletonService;

	@Autowired
	OrderBuilderService orderBuilderService;

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		executeSingletonPattern();

		executeBuilderPattern();
	}

	private void executeSingletonPattern() {
		orderSingletonService.saveOrder();
		orderSingletonService.deleteOrder();
		orderSingletonService.updateOrder();
		orderSingletonService.findOrder();
	}

	private void executeBuilderPattern() {
		orderBuilderService.createOrder();
	}
}
