package com.shoppingcart.JavaShoppingCart.Mapper;

import com.shoppingcart.JavaShoppingCart.dto.ProductCategoryDto;
import com.shoppingcart.JavaShoppingCart.model.ProductCategory;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ProductCategoryMapper {
    ProductCategoryDto toDto(ProductCategory entity);
    ProductCategory toEntity(ProductCategoryDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(ProductCategoryDto dto, @MappingTarget ProductCategory entity);
}
