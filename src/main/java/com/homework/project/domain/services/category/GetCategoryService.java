package com.homework.project.domain.services.category;

import com.homework.project.domain.entities.Category;

public interface GetCategoryService {
    Category findById(Long id);
}
