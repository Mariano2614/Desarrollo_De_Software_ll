package com.homework.project.infrastructure.api.controller.category;

import com.homework.project.application.category.CreateCategoryApplication;
import com.homework.project.application.category.GetCategoryApplication;
import com.homework.project.infrastructure.api.dto.request.CategoryRequest;
import com.homework.project.infrastructure.api.dto.response.CategoryResponse;
import com.homework.project.infrastructure.api.mapper.request.CategoryRequestMapper;
import com.homework.project.infrastructure.api.mapper.response.CategoryResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/category")
public class CategoryController {

    private final CreateCategoryApplication categoryApplication;
    private final GetCategoryApplication getCategoryApplication;
    private final CategoryRequestMapper categoryRequestMapper;
    private final CategoryResponseMapper categoryResponseMapper;

    @PostMapping
    public ResponseEntity<String> createCategory(@RequestBody CategoryRequest categoryRequest) {
        categoryApplication.createCategory(categoryRequestMapper.toEntity(categoryRequest));
        return new ResponseEntity<>("Category Create Successfully!!", HttpStatus.CREATED);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoryResponse> findById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(categoryResponseMapper.toDto(getCategoryApplication.getCategoryById(id)), HttpStatus.FOUND);
    }

}
