package com.shoppingchart.JavaShoppingCart.repository;

import com.shoppingchart.JavaShoppingCart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
