package com.example.demo.controllers;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.services.CategoryService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catagories")
public class CategoryController {
    @Autowired
    private CategoryService catagoryService;
    @GetMapping
    public List<Category> findAll()
    {
        return catagoryService.findAll();
    }


    @PostMapping
    public void addCategory(@RequestBody Category category){
        catagoryService.addCategory(category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)
    {
        catagoryService.delete(id);
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id)
    {
        return catagoryService.getCategoryById(id);

    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Category C)
    {
        catagoryService.update(id, C);
    }

//    @GetMapping("/cat/{price}")
//    public List<Product> getCatAndLessThanMaxPrice(@PathVariable Double price)
//    {
//        catagoryService.getCatAndLessThanMaxPrice(price);
//    }




}
