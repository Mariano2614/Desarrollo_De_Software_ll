package com.homework.project.infrastructure.api.mapper.response;

import com.homework.project.domain.entities.Category;
import com.homework.project.infrastructure.api.dto.response.CategoryResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryResponseMapper {

    CategoryResponse toDto(Category category);

    Category toEntity(CategoryResponse categoryResponse);
}
