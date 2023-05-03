package com.example.product_rest_api.service.impl;

import com.example.product_rest_api.exception.ResourceNotFoundException;
import com.example.product_rest_api.model.Product;
import com.example.product_rest_api.repository.ProductRepository;
import com.example.product_rest_api.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    // definim variabile
    private ProductRepository productRepository;

    // constructor
    public ProductServiceImpl(ProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product get(long id) {
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Bus", "id", id));
    }
}
