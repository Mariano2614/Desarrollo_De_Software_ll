package com.homework.project.infrastructure.mapper.category;

import com.homework.project.domain.entities.Category;
import com.homework.project.infrastructure.repository.category.CategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryDtoMapper {
    Category toEntity(CategoryDto categoryDto);

    CategoryDto toDto(Category category);
}
