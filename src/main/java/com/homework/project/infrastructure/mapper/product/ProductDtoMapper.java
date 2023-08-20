package com.homework.project.infrastructure.mapper.product;

import com.homework.project.domain.entities.Product;
import com.homework.project.infrastructure.mapper.category.CategoryDtoMapper;
import com.homework.project.infrastructure.repository.product.ProductDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {
    CategoryDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductDtoMapper {

    Product toEntity(ProductDto categoryDto);

    ProductDto toDto(Product category);
}
