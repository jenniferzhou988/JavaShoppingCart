package com.shoppingcart.JavaShoppingCart.dto;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductImageDto{
    private Long id;
    private String imageUrl;
    private String description;
    private String altText;
}
