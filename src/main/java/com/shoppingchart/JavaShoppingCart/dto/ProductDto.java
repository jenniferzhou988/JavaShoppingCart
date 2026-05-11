package com.shoppingchart.JavaShoppingCart.dto;

import java.time.LocalDateTime;
import java.util.Set;

public record ProductDto(Long id,
                         String productName,
                         String description,
                         Set<ProductImageDto> images,
                         double salePrice,
                         int stockQuantity,
                         LocalDateTime created,
                         String createdBy,
                         LocalDateTime modified,
                         String modifiedBy,
                         Set<ProductCategoryDto> categories) {
}
