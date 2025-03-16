package com.cavichioli.design_patterns;

import com.cavichioli.design_patterns.creational.builder.service.OrderBuilderService;
import com.cavichioli.design_patterns.creational.singleton.service.OrderSingletonService;
import com.cavichioli.design_patterns.structural.adapter.PaymentAdapter;
import com.cavichioli.design_patterns.structural.adapter.service.OrderAdapterService;
import com.cavichioli.design_patterns.structural.decorator.service.OrderDecoratorService;
import com.cavichioli.design_patterns.structural.facade.OrderFacade;
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

	@Autowired
	OrderDecoratorService orderDecoratorService;

	@Autowired
	OrderFacade orderFacade;

	@Autowired
	OrderAdapterService orderAdapterService;

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		executeSingletonPattern();

		executeBuilderPattern();

		executeDecoratorPattern();

		executeFacadePattern();

		executeAdapterPattern();
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

	private void executeDecoratorPattern() {
		orderDecoratorService.createOrder();
	}

	private void executeFacadePattern() {
		orderFacade.placeOrder();
	}

	private void executeAdapterPattern() {
		orderAdapterService.payOrder();
	}
}
