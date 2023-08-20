package com.homework.project.application.category;

import com.homework.project.domain.entities.Category;
import com.homework.project.domain.services.category.CreateCategoryService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateCategoryApplication {

    private final CreateCategoryService createCategoryService;

    public Category createCategory(Category category) {
        return createCategoryService.category(category);
    }

}
