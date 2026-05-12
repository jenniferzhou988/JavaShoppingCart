package com.shoppingcart.JavaShoppingCart.service.impl;

import com.shoppingcart.JavaShoppingCart.Mapper.ProductCategoryMapper;
import com.shoppingcart.JavaShoppingCart.dto.ProductCategoryDto;
import com.shoppingcart.JavaShoppingCart.model.ProductCategory;
import com.shoppingcart.JavaShoppingCart.repository.ProductCategoryRepository;
import com.shoppingcart.JavaShoppingCart.service.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;
    private final ProductCategoryMapper productCategoryMapper;

    @Override
    public ProductCategoryDto create(ProductCategoryDto dto)
    {
        ProductCategory entity = productCategoryMapper.toEntity(dto);
        ProductCategory saved = productCategoryRepository.save(entity);
        return productCategoryMapper.toDto(saved);
    }

    @Override
    public ProductCategoryDto update(Long id, ProductCategoryDto dto)
    {

        ProductCategory existing = productCategoryRepository.findById(id)
                .orElseThrow( () -> new IllegalArgumentException("Product Category Not found: " + id));

        productCategoryMapper.updateEntityFromDto(dto,existing);
        ProductCategory saved = productCategoryRepository.save(existing);
        return productCategoryMapper.toDto(saved);
    }

    @Override
    public ProductCategoryDto getById(Long id)
    {
        ProductCategory entity = productCategoryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product Category is not found: " + id));
        return productCategoryMapper.toDto(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductCategoryDto> getAll() {
        return productCategoryRepository.findAll()
                .stream()
                .map(productCategoryMapper::toDto)
                .toList();
    }
    @Override
    public void delete(Long id) {
        productCategoryRepository.deleteById(id);
    }

}
