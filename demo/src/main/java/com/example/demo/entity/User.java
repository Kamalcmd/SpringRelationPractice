package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToMany
    @JoinColumn(name="reviews")
    private List<Review> reviews;

    @OneToOne
    private Address address;
}
