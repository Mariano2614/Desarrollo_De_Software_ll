package com.homework.project.infrastructure.adapter.product;

import com.homework.project.domain.entities.Product;
import com.homework.project.domain.services.product.GetProductService;
import com.homework.project.infrastructure.mapper.product.ProductDtoMapper;
import com.homework.project.infrastructure.repository.product.ProductRepository;
import com.homework.project.shared.exception.code.ExceptionCode;
import com.homework.project.shared.messages.ProductNotFoundException;
import com.homework.project.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetProductAdapter implements GetProductService {

    private final ProductRepository productRepository;
    private final ProductDtoMapper productDtoMapper;
    private final MessageUtils messageUtils;

    @Override
    public Product findById(Long id) {
        return productDtoMapper.toEntity(productRepository.findById(id).orElseThrow(
                () -> new ProductNotFoundException(messageUtils.getMessage(ExceptionCode.CATEGORY_NOT_FOUND.getType(), id.toString()))));
    }
}
