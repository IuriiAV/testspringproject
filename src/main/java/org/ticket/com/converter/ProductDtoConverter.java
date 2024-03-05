package org.ticket.com.converter;

import org.ticket.com.dto.ProductDto;
import org.ticket.com.entity.ProductEntity;

public class ProductDtoConverter implements Converter<ProductEntity, ProductDto> {

    @Override
    public ProductDto toDto(ProductEntity entity) {
        return new ProductDto(entity.getId(),entity.getName(),
                entity.getDescription(),entity.getPrice(),entity.getCategory(),
                entity.getImage());
    }

    @Override
    public ProductEntity toEntity(ProductDto productDto) {
        return new ProductEntity(productDto.getName(),
                productDto.getDescription(),
                productDto.getPrice(),
                productDto.getCategory(),
                productDto.getImage());
    }
}
