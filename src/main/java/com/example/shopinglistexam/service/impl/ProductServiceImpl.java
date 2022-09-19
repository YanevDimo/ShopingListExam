package com.example.shopinglistexam.service.impl;

import com.example.shopinglistexam.model.entity.Product;
import com.example.shopinglistexam.model.serviceModel.ProductServiceModel;
import com.example.shopinglistexam.repository.ProductRepository;
import com.example.shopinglistexam.service.CategoryService;
import com.example.shopinglistexam.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryService categoryService;
    private final ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepository productRepository, CategoryService categoryService, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
        this.modelMapper = modelMapper;
    }

    @Override
    public void add(ProductServiceModel productServiceModel) {

        Product product = modelMapper.map(productServiceModel,Product.class);
        product.setCategory(categoryService.findByName(productServiceModel.getCategory()));

        productRepository.save(product);
    }

    @Override
    public BigDecimal getTotalSum() {
        return productRepository.findTotalProductsSum();
    }
}
