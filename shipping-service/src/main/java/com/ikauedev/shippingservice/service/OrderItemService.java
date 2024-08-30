package com.ikauedev.shippingservice.service;

import com.ikauedev.shippingservice.domain.id.OrderItemId;
import com.ikauedev.shippingservice.dto.OrderItemDto;

import java.util.List;

public interface OrderItemService {
    List<OrderItemDto> findAll();
    OrderItemDto findById(final OrderItemId orderItemId);
    OrderItemDto save(final OrderItemDto orderItemDto);
    OrderItemDto update(final OrderItemDto orderItemDto);
    void deleteById(final OrderItemId orderItemId);
}