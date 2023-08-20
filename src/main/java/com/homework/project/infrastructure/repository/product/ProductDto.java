package com.homework.project.infrastructure.repository.product;

import com.homework.project.infrastructure.repository.category.CategoryDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "PRODUCTS")
public class ProductDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryDto category;
    private int stock;
    private Double price;
    @Column(name = "creation_date")
    private LocalDateTime creationDate;
}
