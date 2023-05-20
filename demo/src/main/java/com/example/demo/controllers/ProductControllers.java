package com.example.demo.controllers;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.entity.Review;
import com.example.demo.entity.dtos.ProductDto;
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
    public void addProduct(@RequestBody ProductDto productDto)
    {
        productService.addProduct(productDto);
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

// Product minimum price

    @GetMapping("/minPrice/{price}")
    public List<Product> getPriceGreaterThan(@PathVariable Double price){
        return productService.getPriceGreaterThan(price);
    }

    @GetMapping("/find")
    public List<Product> getCatAndLessThanMaxPrice(@RequestParam Double price, @RequestParam String category)
    {
        return productService.getCatAndLessThanMaxPrice(price, category);


    }

    @GetMapping("/{productId}/reviews")
    public List<Review> findreviewsByProductId(@PathVariable Long productId){
        return productService.findreviewsByProductId(productId);
    }
}
