package com.shoppingcart.JavaShoppingCart.service.impl;

import com.shoppingcart.JavaShoppingCart.Mapper.ProductMapper;
import com.shoppingcart.JavaShoppingCart.dto.ProductDto;
import com.shoppingcart.JavaShoppingCart.dto.ProductRequest;
import com.shoppingcart.JavaShoppingCart.model.Product;
import com.shoppingcart.JavaShoppingCart.model.ProductCategory;
import com.shoppingcart.JavaShoppingCart.model.ProductImage;
import com.shoppingcart.JavaShoppingCart.repository.ProductCategoryRepository;
import com.shoppingcart.JavaShoppingCart.repository.ProductRepository;
import com.shoppingcart.JavaShoppingCart.service.ProductService;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductDto create(ProductDto dto) {
        Product entity = productMapper.toEntity(dto);
        // ensure bidirectional consistency for images
        if (entity.getImages() != null) {
            entity.getImages().forEach(img -> img.setProduct(entity));
        }
        Product saved = productRepository.save(entity);
        return productMapper.toDto(saved);
    }

    @Override
    public ProductDto update(Long id, ProductDto dto) {
        Product existing = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product not found: " + id));

        productMapper.updateEntityFromDto(dto, existing);

        if (existing.getImages() != null) {
            existing.getImages().forEach(img -> img.setProduct(existing));
        }

        Product saved = productRepository.save(existing);
        return productMapper.toDto(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public ProductDto getById(Long id) {
        Product entity = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product not found: " + id));
        return productMapper.toDto(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductDto> getAll() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toDto)
                .toList();
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

}
