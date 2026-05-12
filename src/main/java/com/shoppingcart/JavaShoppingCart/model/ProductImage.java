package com.shoppingcart.JavaShoppingCart.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="product_image")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductImage {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
    private String altText;
    private String imageUrl;
    private String description;
}
