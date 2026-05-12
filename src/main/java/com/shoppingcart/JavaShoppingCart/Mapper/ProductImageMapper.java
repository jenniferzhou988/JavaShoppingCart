package com.shoppingcart.JavaShoppingCart.Mapper;

import com.shoppingcart.JavaShoppingCart.dto.ProductImageDto;
import com.shoppingcart.JavaShoppingCart.model.ProductImage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductImageMapper {
    ProductImageDto toDto(ProductImage entity);
    ProductImage toEntity(ProductImageDto dto);
}
