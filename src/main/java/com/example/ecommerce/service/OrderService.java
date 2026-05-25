package com.example.ecommerce.service;

import com.example.ecommerce.dto.OrderResponse;
import java.util.List;

public interface OrderService {
    OrderResponse placeOrder(String username);
    List<OrderResponse> getOrderHistory(String username);
}
