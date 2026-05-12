package com.shoppingcart.JavaShoppingCart.service;

import com.shoppingcart.JavaShoppingCart.dto.ProductCategoryDto;

import java.util.List;

public interface ProductCategoryService {
    ProductCategoryDto create(ProductCategoryDto dto);
    ProductCategoryDto update(Long id, ProductCategoryDto dto);
    ProductCategoryDto getById(Long id);
    List<ProductCategoryDto> getAll();
    void delete(Long id);
}
