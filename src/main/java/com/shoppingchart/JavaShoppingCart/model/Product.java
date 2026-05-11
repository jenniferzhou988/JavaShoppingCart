package com.shoppingchart.JavaShoppingCart.model;

import java.time.LocalDateTime;


import jakarta.persistence.*;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String description;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductImage> images;

    private double salePrice;
    private int stockQuantity;
    private LocalDateTime created;
    private String createdBy;
    private LocalDateTime modified;
    private String modifiedBy;

    @ManyToMany
    @JoinTable(
        name = "product_product_category",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<ProductCategory> categories;

}
