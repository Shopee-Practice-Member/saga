package com.example.saga.product.command;

import io.eventuate.tram.commands.common.Command;
import lombok.Builder;

import java.util.List;

@Builder
public record BookingProductsCommand(
        String orderId,
        List<BookingProductDetail> bookingProductDetails) implements Command {
}
