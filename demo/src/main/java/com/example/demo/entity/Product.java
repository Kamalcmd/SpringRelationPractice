package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private Double price;
    private Double rating;

    @OneToMany
    @JoinColumn(name = "review_id")
    private List<Review> reviews;

}
