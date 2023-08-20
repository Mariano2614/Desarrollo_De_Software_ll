package com.homework.project.infrastructure.api.mapper.request;

import com.homework.project.domain.entities.Product;
import com.homework.project.infrastructure.api.dto.request.ProductRequest;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {
    CategoryRequestMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductRequestMapper {

    ProductRequest toDto(Product product);

    @Mapping(source = "categoryId",target = "category.id")
    Product toEntity(ProductRequest productRequest);
}
