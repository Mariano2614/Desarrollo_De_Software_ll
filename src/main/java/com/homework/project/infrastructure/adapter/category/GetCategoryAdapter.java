package com.homework.project.infrastructure.adapter.category;

import com.homework.project.domain.entities.Category;
import com.homework.project.domain.services.category.GetCategoryService;
import com.homework.project.infrastructure.mapper.category.CategoryDtoMapper;
import com.homework.project.infrastructure.repository.category.CategoryRepository;
import com.homework.project.shared.exception.code.ExceptionCode;
import com.homework.project.shared.messages.category.CategoryNotFoundException;
import com.homework.project.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetCategoryAdapter implements GetCategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryDtoMapper categoryDtoMapper;
    private final MessageUtils messageUtils;

    @Override
    public Category findById(Long id) {
        return categoryDtoMapper.toEntity(categoryRepository.findById(id).orElseThrow(
                () -> new CategoryNotFoundException(messageUtils.getMessage(ExceptionCode.CATEGORY_NOT_FOUND.getType(), id.toString()))));
    }
}
