package com.homework.project.application;

import com.homework.project.application.category.CreateCategoryApplication;
import com.homework.project.application.category.GetCategoryApplication;
import com.homework.project.application.product.CreateProductApplication;
import com.homework.project.application.product.GetProductApplication;
import com.homework.project.domain.services.category.CreateCategoryService;
import com.homework.project.domain.services.category.GetCategoryService;
import com.homework.project.domain.services.product.CreateProductService;
import com.homework.project.domain.services.product.GetProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BeanModuleApplication {

    @Bean
    public CreateCategoryApplication createCategoryApplication(
            CreateCategoryService createCategoryService) {
        return new CreateCategoryApplication(createCategoryService);
    }

    @Bean
    public CreateProductApplication createProductApplication(
            CreateProductService createProductService,
            GetCategoryApplication getCategoryApplication) {
        return new CreateProductApplication(createProductService, getCategoryApplication);
    }

    @Bean
    public GetCategoryApplication getCategoryApplication(
            GetCategoryService getCategoryService) {
        return new GetCategoryApplication(getCategoryService);
    }

    @Bean
    public GetProductApplication getProductApplication(
            GetProductService getProductService) {
        return new GetProductApplication(getProductService);
    }

}