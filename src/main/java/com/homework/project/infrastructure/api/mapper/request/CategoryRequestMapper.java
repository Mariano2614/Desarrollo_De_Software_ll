package com.homework.project.infrastructure.api.mapper.request;

import com.homework.project.domain.entities.Category;
import com.homework.project.infrastructure.api.dto.request.CategoryRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryRequestMapper {


    CategoryRequest toDto(Category category);

    Category toEntity(CategoryRequest categoryRequest);
}
