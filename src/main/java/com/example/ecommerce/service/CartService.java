package com.example.ecommerce.service;

import com.example.ecommerce.dto.CartItemRequest;
import com.example.ecommerce.dto.CartResponse;

public interface CartService {
    CartResponse addProductToCart(String username, CartItemRequest request);
    CartResponse removeProductFromCart(String username, Long productId);
    CartResponse getCart(String username);
}
