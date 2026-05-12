package com.shoppingcart.JavaShoppingCart.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Setter
@Getter
public class ProductRequest {
    private String productName;
    private String description;
    private Double salePrice;
    private int stockQuantity;
    private LocalDateTime created;
    private String createdBy;
    private LocalDateTime modified;
    private String modifiedBy;
    private Set<Long> categoryIds;
    private Set<String> imageUrls;
}
