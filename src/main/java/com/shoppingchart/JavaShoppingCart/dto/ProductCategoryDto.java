package com.shoppingchart.JavaShoppingCart.dto;

import java.time.LocalDateTime;

public record ProductCategoryDto(
     Long id,
     String productCategoryName,
     String description,
     String comment,
     LocalDateTime created,
     String createdBy,
     LocalDateTime modified,
     String modifiedBy){
}
