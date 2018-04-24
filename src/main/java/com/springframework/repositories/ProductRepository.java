package com.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
