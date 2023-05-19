package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="Users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

//    @OneToMany
//    @JoinColumn(name="userId")
//    private List<Review> reviews;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
}
