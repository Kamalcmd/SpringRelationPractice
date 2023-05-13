package com.example.demo.services;

import com.example.demo.entity.Category;
import com.example.demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository repositories;
    @Override
    public List<Category> findAll() {
        return repositories.findAll();
    }

    @Override
    public void addCategory(Category category) {
        repositories.save(category);
    }

    @Override
    public void delete(Long id) {
        repositories.deleteById(id);

    }


}
