package com.example.stockmicroservice.category.application.dto.response;

import java.time.LocalDateTime;

public record SaveCategoryResponse(String message, LocalDateTime time) {
}
