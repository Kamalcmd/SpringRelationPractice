package com.example.demo.entity.dtos;

import lombok.Data;

@Data
public class ReviewDto {
    private String comment;
    private Long productId;
}
