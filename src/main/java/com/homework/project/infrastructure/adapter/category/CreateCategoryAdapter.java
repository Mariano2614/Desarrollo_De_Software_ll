package com.homework.project.infrastructure.adapter.category;

import com.homework.project.domain.entities.Category;
import com.homework.project.domain.services.category.CreateCategoryService;
import com.homework.project.infrastructure.mapper.category.CategoryDtoMapper;
import com.homework.project.infrastructure.repository.category.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateCategoryAdapter implements CreateCategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryDtoMapper categoryDtoMapper;

    @Override
    public Category category(Category category) {
        return categoryDtoMapper.toEntity(categoryRepository.save(categoryDtoMapper.toDto(category)));
    }
}
