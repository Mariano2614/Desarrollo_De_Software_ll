package com.homework.project.infrastructure.adapter.product;

import com.homework.project.domain.entities.Product;
import com.homework.project.domain.services.product.CreateProductService;
import com.homework.project.infrastructure.mapper.product.ProductDtoMapper;
import com.homework.project.infrastructure.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreateProductAdapter implements CreateProductService {

    private final ProductRepository productRepository;
    private final ProductDtoMapper productDtoMapper;


    @Override
    public Product saveProduct(Product product) {
        return productDtoMapper.toEntity(productRepository.save(productDtoMapper.toDto(product)));
    }
}
