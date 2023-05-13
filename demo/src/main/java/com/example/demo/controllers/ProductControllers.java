package com.example.demo.controllers;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductControllers {
@Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
       return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @PostMapping
    public void addProduct(@RequestBody Product product)
    {
        productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id )
    {
        productService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Product P)
    {
        productService.update(id, P);
    }



}
