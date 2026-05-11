package com.shoppingchart.JavaShoppingCart.service;
import com.shoppingchart.JavaShoppingCart.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.shoppingchart.JavaShoppingCart.Mapper.ProductMapper;
import com.shoppingchart.JavaShoppingCart.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductDto> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toDto)
                .collect(Collectors.toList());
    }

    public ProductDto getProductById(Long id) {
        return productRepository.findById(id)
                .map(productMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Product not found: " + id));
    }

    public ProductDto createProduct(ProductDto dto) {
        return productMapper.toDto(
                productRepository.save(productMapper.toEntity(dto))
        );
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
