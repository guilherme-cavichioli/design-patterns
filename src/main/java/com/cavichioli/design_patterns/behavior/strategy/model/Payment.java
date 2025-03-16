package com.cavichioli.design_patterns.behavior.strategy.model;

import com.cavichioli.design_patterns.behavior.strategy.model.enums.PaymentTypeEnum;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Payment {
    private Long id;
    private PaymentTypeEnum type;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
