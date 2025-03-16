package com.cavichioli.design_patterns.structural.facade;

import com.cavichioli.design_patterns.structural.facade.model.Order;
import com.cavichioli.design_patterns.structural.facade.service.CouponService;
import com.cavichioli.design_patterns.structural.facade.service.InventoryService;
import com.cavichioli.design_patterns.structural.facade.service.PaymentService;
import com.cavichioli.design_patterns.structural.facade.service.ShippingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderFacade {

    private final CouponService couponService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;
    private final InventoryService inventoryService;

    public void placeOrder() {
        Order order = new Order.OrderBuilder().id(1L).build();
        couponService.applyCoupon(order);
        if (inventoryService.checkStock(order) && paymentService.processPayment(order)) {
            shippingService.shipOrder(order);
            System.out.println("Order placed successfully");
        } else {
            System.out.println("Order failed");
        }
    }



}
