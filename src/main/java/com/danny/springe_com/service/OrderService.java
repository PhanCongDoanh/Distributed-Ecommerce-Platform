package com.danny.springe_com.service;

import com.danny.springe_com.model.Order;
import com.danny.springe_com.model.dto.OrderRequest;
import com.danny.springe_com.model.dto.OrderResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class OrderService {

    public static OrderResponse placeOrder(OrderRequest request) {
        Order order = new Order();
        String orderId = "ORD" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        order.setOrderId(orderId);
        order.setCustomerName(request.customerName());
        order.setEmail(request.email());
        order.setStatus("PLACED");
        order.setOrderDate(LocalDate.now());
        return null;
    }
}
