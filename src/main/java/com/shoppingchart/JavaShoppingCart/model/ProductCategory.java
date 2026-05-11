package com.shoppingchart.JavaShoppingCart.model;

import java.time.LocalDateTime;

import java.util.List;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="product_category")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productCategoryName;
    private String description;
    private String comment;
    private LocalDateTime created;
    private String createdBy;
    private LocalDateTime modified;
    private String modifiedBy;
    @ManyToMany(mappedBy = "categories")
    private List<Product> products;

}
