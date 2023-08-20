package com.homework.project.infrastructure.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    private String name;
    private Long categoryId;
    private int stock;
    private Double price;
}
