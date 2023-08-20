package com.homework.project.infrastructure.api.mapper.response;

import com.homework.project.domain.entities.Product;
import com.homework.project.infrastructure.api.dto.response.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductResponseMapper {

    ProductResponse toDto(Product product);

    Product toEntity(ProductResponse productResponse);
}
