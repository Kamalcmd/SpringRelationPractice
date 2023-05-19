package com.example.demo.services;

import com.example.demo.entity.Product;
import com.example.demo.entity.dtos.ProductDto;

import java.util.List;

public interface ProductService {


    List<Product> getProducts();

    void addProduct(ProductDto productDto);

    Product getProductById(Long id);

    void deleteById(Long id);

    void update(Long id, Product p);

    List<Product> getPriceGreaterThan(Double price);
}
