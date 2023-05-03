package com.example.product_rest_api.service;

import com.example.product_rest_api.model.Product;
import com.example.product_rest_api.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAll();
    Product get(long id);
    Product update(Product product, long id);
    void delete(long id);

}
