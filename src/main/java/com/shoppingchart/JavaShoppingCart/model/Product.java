package com.shoppingchart.JavaShoppingCart.model;

import jakarta.persistence.Entity;

@Entity
public class Product {
    private Long id;
    private String name;
    private String description;
    private double price;
    private int stockQuantity;

}
