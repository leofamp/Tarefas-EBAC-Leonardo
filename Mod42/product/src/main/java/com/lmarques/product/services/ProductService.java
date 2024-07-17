package com.lmarques.product.services;

import com.lmarques.product.core.domain.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {
    public ResponseEntity<Product> create(Product product);
    public  ResponseEntity<Product> update(Product product, UUID id);
    public void delete(UUID id);
    public ResponseEntity<Optional<Product>> findById(UUID id);
    public ResponseEntity<List<Product>> findAll();
}
