package com.example.demo.controllers;

import com.example.demo.entity.Review;
import com.example.demo.entity.dtos.ProductDto;
import com.example.demo.entity.dtos.ReviewDto;
import com.example.demo.repositories.ReviewRepo;
import com.example.demo.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;


    @GetMapping
    public List<Review> getReview(){
        return reviewService.getReview();
    }

    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable Long id){
        return reviewService.getReviewById(id);

    }

    @PostMapping
    public void addReview(@RequestBody ReviewDto reviewDto)
    {
        reviewService.addReview(reviewDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        reviewService.delete(id);
    }

    @PutMapping("/{id}")
    public void udpate(@PathVariable Long id, @RequestBody Review R)
    {
        reviewService.update(id, R);
    }

}
