package com.shoppingchart.JavaShoppingCart.Mapper;

import com.shoppingchart.JavaShoppingCart.dto.ProductImageDto;
import com.shoppingchart.JavaShoppingCart.model.ProductImage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductImageMapper {
    ProductImageDto toDto(ProductImage entity);
    ProductImage toEntity(ProductImageDto dto);
}
