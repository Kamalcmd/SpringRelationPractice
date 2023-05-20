package com.example.demo.services.Implements;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.entity.Review;
import com.example.demo.entity.dtos.ProductDto;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ProductRepo;
import com.example.demo.repositories.ReviewRepo;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ReviewRepo reviewRepo;

    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Override
    public void addProduct(ProductDto productDto) {
        Product product=new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setRating(productDto.getRating());
        product.setCategory(categoryRepository.findById(productDto.getCategoryId()).get());
        productRepo.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepo.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        productRepo.deleteById(id);
    }

    @Override
    public void update(Long id, Product p) {
      p.setId(id);
        productRepo.save(p);

    }

    @Override
    public List<Product> getPriceGreaterThan(Double price) {
        return productRepo.findProductsByPriceGreaterThan(price);
    }

    @Override
    public List<Product> getCatAndLessThanMaxPrice(Double price, String category) {
        List<Product> products=productRepo.findAll();
        return products.stream().
                filter(p->p.getCategory().getName().equals(category))
                .filter(p->p.getPrice()<price)
                .collect(Collectors.toList());


    }

    @Override
    public List<Review> findreviewsByProductId(Long productId) {
        Product product=productRepo.findById(productId).get();
        return  reviewRepo.findReviewsByProduct(product);
    }


}



