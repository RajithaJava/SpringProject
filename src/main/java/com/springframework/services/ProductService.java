package com.springframework.services;

import java.util.List;

import com.springframework.commands.ProductForm;
import com.springframework.domain.Product;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);

    void sendMessage(String id);
}
