package com.cavichioli.design_patterns.structural.facade.service;

import com.cavichioli.design_patterns.structural.facade.model.Order;
import org.springframework.stereotype.Service;

@Service
public class CouponService {
    public void applyCoupon(Order order) {
        System.out.println("Coupon applied for order: " + order.getId());
    }
}
