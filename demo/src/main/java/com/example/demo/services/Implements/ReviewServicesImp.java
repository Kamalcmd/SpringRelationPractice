package com.example.demo.services.Implements;

import com.example.demo.entity.Review;
import com.example.demo.entity.dtos.ReviewDto;
import com.example.demo.repositories.AddressRepo;
import com.example.demo.repositories.ProductRepo;
import com.example.demo.repositories.ReviewRepo;
import com.example.demo.repositories.UserRipo;
import com.example.demo.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServicesImp implements ReviewService {
    @Autowired
    private ReviewRepo reviewRepo;

    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private UserRipo userRipo;
    @Override
    public List<Review> getReview() {
        return reviewRepo.findAll();
    }

    @Override
    public Review getReviewById(Long id) {
        return reviewRepo.findById(id).get();
    }

    @Override
    public void addReview(ReviewDto reviewDto) {
        Review review= new Review();
        review.setComment(reviewDto.getComment());
        review.setProduct(productRepo.findById(reviewDto.getProductId()).get());
        review.setUser(userRipo.findById(reviewDto.getUserId()).get());
        reviewRepo.save(review);
    }

    @Override
    public void delete(Long id) {
        reviewRepo.deleteById(id);
    }

    @Override
    public void update(Long id, Review r) {
        r.setId(id);
        reviewRepo.save(r);
    }

}
