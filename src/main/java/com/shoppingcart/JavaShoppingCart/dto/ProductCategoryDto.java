package com.shoppingcart.JavaShoppingCart.dto;

import lombok.Builder;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategoryDto{
     private Long id;
     private String productCategoryName;
     private String description;
     private String comment;
     private LocalDateTime created;
     private String createdBy;
     private LocalDateTime modified;
     private String modifiedBy;
     private String code;
}
