package com.shoppingchart.JavaShoppingCart.Mapper;

import com.shoppingchart.JavaShoppingCart.dto.ProductCategoryDto;
import com.shoppingchart.JavaShoppingCart.model.ProductCategory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductCategoryMapper {
    ProductCategoryDto toDto(ProductCategory entity);
    ProductCategory toEntity(ProductCategoryDto dto);
}
