package com.example.demo.entity.dtos;

import lombok.Data;

@Data
public class ProductDto {
    private String name;
    private Double price;
    private Double rating;
    private Long categoryId;
}
