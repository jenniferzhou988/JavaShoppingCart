package com.shoppingchart.JavaShoppingCart.repository;

import com.shoppingchart.JavaShoppingCart.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
