package com.example.demo.repositories;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
    List<Product> findProductsByPriceGreaterThan(Double price);

   // @Query(value = "Select * from product p, category c where   c.name=:category and p.price<:price", nativeQuery = true)

}
