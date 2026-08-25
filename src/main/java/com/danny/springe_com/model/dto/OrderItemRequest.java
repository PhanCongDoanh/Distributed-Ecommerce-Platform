package com.danny.springe_com.model.dto;

public record OrderItemRequest(
        Long productId,
        int quantity
) { }
