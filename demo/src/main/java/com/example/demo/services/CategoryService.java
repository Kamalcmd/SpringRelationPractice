package com.example.demo.services;

import com.example.demo.entity.Category;

import java.util.List;

public interface CategoryService {


    List<Category> findAll();

    void addCategory(Category category);

     void delete(Long id);
     Category getCategoryById(Long id);

    void update(Long id, Category c);


}
