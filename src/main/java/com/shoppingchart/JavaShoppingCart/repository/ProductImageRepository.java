package com.shoppingchart.JavaShoppingCart.repository;

import com.shoppingchart.JavaShoppingCart.model.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage,Long>
{

}
