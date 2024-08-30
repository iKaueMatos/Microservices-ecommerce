package com.ikauedev.orderservice.helper;

import com.ikauedev.orderservice.dto.order.CartDto;
import com.ikauedev.orderservice.dto.order.OrderDto;
import com.ikauedev.orderservice.dto.product.ProductDto;
import com.ikauedev.orderservice.entity.Cart;
import com.ikauedev.orderservice.entity.Order;

public interface OrderMappingHelper {
    static OrderDto map(Order order) {
        if (order == null) return null;
        return OrderDto.builder()
                .orderId(order.getOrderId())
                .orderDate(order.getOrderDate())
                .orderDesc(order.getOrderDesc())
                .orderFee(order.getOrderFee())
                .productId(order.getProductId())
                .cartDto(CartDto.builder()
                        .cartId(order.getCart().getCartId())
                        .userId(order.getCart().getUserId())
                        .build())
                .build();
    }

    static Order map(final OrderDto orderDto) {
        if (orderDto == null) return null;
        return Order.builder()
                .orderId(orderDto.getOrderId())
                .orderDate(orderDto.getOrderDate())
                .orderDesc(orderDto.getOrderDesc())
                .orderFee(orderDto.getOrderFee())
                .productId(orderDto.getProductId())
                .cart(Cart.builder()
                        .cartId(orderDto.getCartDto().getCartId())
                        .userId(orderDto.getCartDto().getUserId())
                        .build())
                .build();
    }
}
