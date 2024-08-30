package com.ikauedev.shippingservice.helper;

import com.ikauedev.shippingservice.domain.OrderItem;
import com.ikauedev.shippingservice.dto.OrderDto;
import com.ikauedev.shippingservice.dto.OrderItemDto;
import com.ikauedev.shippingservice.dto.ProductDto;

public interface OrderItemMappingHelper {

    static OrderItemDto map(final OrderItem orderItem) {
        return OrderItemDto.builder()
                .productId(orderItem.getProductId())
                .orderId(orderItem.getOrderId())
                .orderedQuantity(orderItem.getOrderedQuantity())
                .productDto(
                        ProductDto.builder()
                                .productId(orderItem.getProductId())
                                .build())
                .orderDto(
                        OrderDto.builder()
                                .orderId(orderItem.getOrderId())
                                .build())
                .build();
    }

    static OrderItem map(final OrderItemDto orderItemDto) {
        return OrderItem.builder()
                .productId(orderItemDto.getProductId())
                .orderId(orderItemDto.getOrderId())
                .orderedQuantity(orderItemDto.getOrderedQuantity())
                .build();
    }

}