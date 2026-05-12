package com.shoppingcart.JavaShoppingCart.Mapper;
import com.shoppingcart.JavaShoppingCart.dto.ProductDto;
import com.shoppingcart.JavaShoppingCart.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.BeanMapping;
import org.mapstruct.InheritInverseConfiguration;
@Mapper(componentModel="spring",
        uses = {ProductCategoryMapper.class,ProductImageMapper.class})
public interface ProductMapper {
    @Mapping(target = "categories", source = "categories")
    @Mapping(target = "images", source = "images")
    ProductDto toDto(Product entity);

    @InheritInverseConfiguration
    Product toEntity(ProductDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(ProductDto dto, @MappingTarget Product entity);
}
