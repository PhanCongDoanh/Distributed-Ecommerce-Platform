package com.danny.springe_com.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) { }
