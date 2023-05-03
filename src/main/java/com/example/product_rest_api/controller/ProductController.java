package com.example.product_rest_api.controller;

import com.example.product_rest_api.model.Product;
import com.example.product_rest_api.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spring/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // facem metoda de creare
    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    // facem metoda de a primi toate inregistrarile
    @GetMapping
    public List<Product> get() {
        return productService.getAll();
    }

    // facem metoda de a primi o inregsitrare dupa id
    @GetMapping("{id}")
    public ResponseEntity<Product> get(@PathVariable("id") long id) {
        return new ResponseEntity<Product>(productService.get(id), HttpStatus.OK);
    }

    // facem metoda de a actualiza o inregistrare
    @PutMapping("{id}")
    public ResponseEntity<Product> update(@PathVariable("id") long id, @RequestBody Product product) {
        return new ResponseEntity<Product>(productService.update(product, id), HttpStatus.OK);
    }

    // facem metoda de a sterge o inregistrare
    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable("id") long id) {
        productService.delete(id);
        return new ResponseEntity<String>("Product is deleted", HttpStatus.OK);
    }
}
