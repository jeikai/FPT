package com.product.fptSpring.repository;

import com.product.fptSpring.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
