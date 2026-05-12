package com.shoppingcart.JavaShoppingCart.dto;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto{
    private Long id;
    private String productName;
    private String description;
    private double salePrice;
    private int stockQuantity;
    private LocalDateTime created;
    private String createdBy;
    private LocalDateTime modified;
    private String modifiedBy;
    private String sku;
    private Set<ProductCategoryDto> categories;
    private List<ProductImageDto> images;
}
