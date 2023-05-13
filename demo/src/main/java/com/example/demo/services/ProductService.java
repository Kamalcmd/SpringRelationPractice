package com.example.demo.services;

import com.example.demo.entity.Product;

import java.util.List;

public interface ProductService {


    List<Product> getProducts();

    void addProduct(Product product);

    Product getProductById(Long id);

    void deleteById(Long id);

    void update(Long id, Product p);
}
