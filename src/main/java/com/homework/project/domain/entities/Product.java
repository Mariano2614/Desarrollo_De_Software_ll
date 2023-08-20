package com.homework.project.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;
    private String name;
    private Category category;
    private int stock;
    private Double price;
    private LocalDateTime creationDate;

}
