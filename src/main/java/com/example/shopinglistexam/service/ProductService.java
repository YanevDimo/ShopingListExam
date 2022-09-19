package com.example.shopinglistexam.service;

import com.example.shopinglistexam.model.serviceModel.ProductServiceModel;

import java.math.BigDecimal;

public interface ProductService {
    void add(ProductServiceModel productServiceModel);

    BigDecimal getTotalSum();
}
