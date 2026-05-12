package com.shoppingcart.JavaShoppingCart.service;
import com.shoppingcart.JavaShoppingCart.dto.ProductDto;
import java.util.List;

public interface ProductService {
    ProductDto create(ProductDto dto);
    ProductDto update(Long id, ProductDto dto);
    ProductDto getById(Long id);
    List<ProductDto> getAll();
    void delete(Long id);
}
