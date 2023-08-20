package com.homework.project.domain.services.product;

import com.homework.project.domain.entities.Product;

public interface GetProductService {

    Product findById(Long id);
}
