package com.homework.project.application.product;

import com.homework.project.domain.entities.Product;
import com.homework.project.domain.services.product.GetProductService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetProductApplication {

    private final GetProductService getProductService;

    public Product findById(Long id) {
        return getProductService.findById(id);
    }

}
