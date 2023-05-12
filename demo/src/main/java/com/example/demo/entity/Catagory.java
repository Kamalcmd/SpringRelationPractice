package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Catagory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;

    @OneToMany
    @JoinColumn(name = "catagory_id")
    private List<Product> products;

}
