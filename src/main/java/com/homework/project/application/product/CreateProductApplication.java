package com.homework.project.application.product;

import com.homework.project.application.category.GetCategoryApplication;
import com.homework.project.domain.entities.Category;
import com.homework.project.domain.entities.Product;
import com.homework.project.domain.services.product.CreateProductService;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class CreateProductApplication {

    private final CreateProductService createProductService;
    private final GetCategoryApplication getCategoryApplication;

    public Product createProduct(Product product) {
        Category category = getCategoryApplication.getCategoryById(product.getCategory().getId());
        product.setCreationDate(LocalDateTime.now());
        product.setCategory(category);
        return createProductService.saveProduct(product);
    }
}
