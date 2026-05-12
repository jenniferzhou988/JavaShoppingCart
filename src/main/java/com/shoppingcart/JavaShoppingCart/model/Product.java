package com.shoppingcart.JavaShoppingCart.model;

import java.time.LocalDateTime;


import jakarta.persistence.*;

import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;



@Entity
@Table(name="product")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String description;
    private String sku;
    private double salePrice;
    private int stockQuantity;
    private LocalDateTime created;
    private String createdBy;
    private LocalDateTime modified;
    private String modifiedBy;

    @ManyToMany(fetch = FetchType.LAZY,cascade ={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
        name = "product_category_map",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    @Builder.Default
    private Set<ProductCategory> categories= new HashSet<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<ProductImage> images= List.of();
}
