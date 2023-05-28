package com.example.product_rest_api.model;

import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "Numele produsului nu poate fi gol")
    @Size(min = 2, max = 100, message = "Numele produsului trebuie să fie între 2 și 100 de caractere")
    @Column(name = "nameProduct")
    private String nameProduct;

    @Column(name = "descriptionProduct")
    private String descriptionProduct;

    @NotNull(message = "Prețul produsului nu poate fi null")
    @Column(name = "priceProduct")
    private Integer priceProduct;
}
