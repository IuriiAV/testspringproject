package org.ticket.com.service;

import lombok.RequiredArgsConstructor;
import org.ticket.com.entity.ProductEntity;
import org.ticket.com.repository.ProductJpaRepository;

import java.util.List;

@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductJpaRepository repository;

    @Override
    public ProductEntity create(ProductEntity entity) {
        //check something
        return repository.save(entity);
    }

    @Override
    public List<ProductEntity> list(String category, double price) {
        return null;
    }
}
