package com.example.saga.product.command;

import lombok.Builder;

@Builder
public record BookingProductDetail(
        String productId,
        Integer quantity
) {
}
