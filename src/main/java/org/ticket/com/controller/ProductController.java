package org.ticket.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.ticket.com.converter.Converter;
import org.ticket.com.dto.ProductCreateDto;
import org.ticket.com.dto.ProductDto;
import org.ticket.com.entity.ProductEntity;
import org.ticket.com.service.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @Autowired
    private Converter<ProductEntity, ProductDto> converter;

    @GetMapping
    public List<ProductDto> list(@RequestParam(name = "category", required = false) String category,
                                 @RequestParam(name = "price") double price){
        List<ProductEntity> list = service.list(category, price);
        return list.stream()
                .map(product-> converter.toDto(product))
                .collect(Collectors.toList());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ProductDto addProduct(@RequestBody ProductDto productDto) {
        ProductEntity productEntity = converter.toEntity(productDto);
        ProductEntity entity = service.create(productEntity);
        return converter.toDto(entity);
    }
}
