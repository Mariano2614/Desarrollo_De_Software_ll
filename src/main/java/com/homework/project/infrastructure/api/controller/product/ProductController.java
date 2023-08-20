package com.homework.project.infrastructure.api.controller.product;


import com.homework.project.application.product.CreateProductApplication;
import com.homework.project.application.product.GetProductApplication;
import com.homework.project.infrastructure.api.dto.request.ProductRequest;
import com.homework.project.infrastructure.api.dto.response.ProductResponse;
import com.homework.project.infrastructure.api.mapper.request.ProductRequestMapper;
import com.homework.project.infrastructure.api.mapper.response.ProductResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/product")
public class ProductController {

    private final CreateProductApplication createProductApplication;
    private final GetProductApplication getProductApplication;
    private final ProductRequestMapper productRequestMapper;
    private final ProductResponseMapper productResponseMapper;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductResponse> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(productResponseMapper.toDto(getProductApplication.findById(id)), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductRequest productRequest) {
        createProductApplication.createProduct(productRequestMapper.toEntity(productRequest));
        return new ResponseEntity<>("Product Create Successfully!!", HttpStatus.CREATED);
    }
}
