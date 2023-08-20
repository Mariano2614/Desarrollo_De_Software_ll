package com.homework.project.application.category;

import com.homework.project.domain.entities.Category;
import com.homework.project.domain.services.category.GetCategoryService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetCategoryApplication {
    private final GetCategoryService getCategoryService;

    public Category getCategoryById(Long id) {
        return getCategoryService.findById(id);
    }
}
