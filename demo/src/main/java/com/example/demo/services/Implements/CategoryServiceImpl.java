package com.example.demo.services.Implements;

import com.example.demo.entity.Category;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.services.CategoryService;
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

    @Override
    public Category getCategoryById(Long id) {
        return repositories.findById(id).get();

    }

    @Override
    public void update(Long id, Category c) {
        c.setId(id);
        repositories.save(c);
    }


    public static class ReviewServiceImp {
    }
}
