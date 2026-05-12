package com.shoppingcart.JavaShoppingCart.repository;

import com.shoppingcart.JavaShoppingCart.model.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage,Long>
{

}
