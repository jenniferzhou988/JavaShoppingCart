package com.shoppingcart.JavaShoppingCart.repository;

import com.shoppingcart.JavaShoppingCart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
