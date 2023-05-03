package com.example.product_rest_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nameProduct")
    private String nameProduct;

    @Column(name = "descriptionProduct")
    private String descriptionProduct;

    @Column(name = "priceProduct")
    private Integer priceProduct;
}
