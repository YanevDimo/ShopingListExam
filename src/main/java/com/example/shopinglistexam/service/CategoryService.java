package com.example.shopinglistexam.service;

import com.example.shopinglistexam.model.entity.Category;
import com.example.shopinglistexam.model.entity.enums.CategoryEnum;

public interface CategoryService {
    void initCategories();

    Category findByName(CategoryEnum categoryEnum);
}
