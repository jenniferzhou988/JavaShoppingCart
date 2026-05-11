package com.shoppingchart.JavaShoppingCart.Mapper;
import com.shoppingchart.JavaShoppingCart.dto.ProductDto;
import com.shoppingchart.JavaShoppingCart.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring", uses = {ProductCategoryMapper.class,ProductImageMapper.class})
public interface ProductMapper {
    ProductDto toDto(Product entity);
    @Mapping(target="categories",ignore=true)
    @Mapping(target="images",ignore=true)
    Product toEntity(ProductDto dto);
}
