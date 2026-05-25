package com.example.ecommerce.controller;

import com.example.ecommerce.dto.CartItemRequest;
import com.example.ecommerce.dto.CartResponse;
import com.example.ecommerce.service.CartService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;

@RestController
@RequestMapping("/api/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping
    public ResponseEntity<CartResponse> getCart(Principal principal) {
        CartResponse cartResponse = cartService.getCart(principal.getName());
        return ResponseEntity.ok(cartResponse);
    }

    @PostMapping("/add")
    public ResponseEntity<CartResponse> addProductToCart(Principal principal, 
                                                         @Valid @RequestBody CartItemRequest request) {
        CartResponse cartResponse = cartService.addProductToCart(principal.getName(), request);
        return ResponseEntity.ok(cartResponse);
    }

    @DeleteMapping("/remove/{productId}")
    public ResponseEntity<CartResponse> removeProductFromCart(Principal principal, 
                                                              @PathVariable Long productId) {
        CartResponse cartResponse = cartService.removeProductFromCart(principal.getName(), productId);
        return ResponseEntity.ok(cartResponse);
    }
}
