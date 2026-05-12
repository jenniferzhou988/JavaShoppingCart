package com.shoppingcart.JavaShoppingCart.controller;

import com.shoppingcart.JavaShoppingCart.dto.ProductCategoryDto;
import com.shoppingcart.JavaShoppingCart.service.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/productcategory")
@RequiredArgsConstructor
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    @PostMapping
    public ResponseEntity<ProductCategoryDto> create(@RequestBody ProductCategoryDto dto) {
        ProductCategoryDto created = productCategoryService.create(dto);
        return ResponseEntity
                .created(URI.create("/api/productcategory/" + created.getId()))
                .body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductCategoryDto> update(@PathVariable Long id,
                                             @RequestBody ProductCategoryDto dto) {
        return ResponseEntity.ok(productCategoryService.update(id, dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductCategoryDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(productCategoryService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProductCategoryDto>> getAll() {
        return ResponseEntity.ok(productCategoryService.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productCategoryService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
