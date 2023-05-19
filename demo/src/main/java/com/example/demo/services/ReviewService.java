package com.example.demo.services;

import com.example.demo.entity.Review;
import com.example.demo.entity.dtos.ReviewDto;

import java.util.List;

public interface ReviewService {
    List<Review> getReview();

    Review getReviewById(Long id);

    void addReview(ReviewDto reviewDto);

    void delete(Long id);

    void update(Long id, Review r);
}
