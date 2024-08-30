package com.ikauedev.shippingservice.repository;

import com.ikauedev.shippingservice.domain.OrderItem;
import com.ikauedev.shippingservice.domain.id.OrderItemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemId> {

}