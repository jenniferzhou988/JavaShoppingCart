package com.shoppingchart.JavaShoppingCart.model;

import java.time.LocalDateTime;

import java.util.List;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@Entity
@Table(name="product_category")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String productCategoryName;
    private String description;
    private String comment;
    private LocalDateTime created;
    private String createdBy;
    private LocalDateTime modified;
    private String modifiedBy;
    @ManyToMany(mappedBy = "categories",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Product> products;

}
