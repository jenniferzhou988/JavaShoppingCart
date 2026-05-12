package com.shoppingcart.JavaShoppingCart.model;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="product_category")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    private String code;
    @ManyToMany(mappedBy = "categories",fetch = FetchType.LAZY)
    @JsonIgnore
    @Builder.Default
    private Set<Product> products = new HashSet<>();
}
