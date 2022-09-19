package com.example.shopinglistexam.service.impl;

import com.example.shopinglistexam.model.entity.Category;
import com.example.shopinglistexam.model.entity.enums.CategoryEnum;
import com.example.shopinglistexam.repository.CategoryRepository;
import com.example.shopinglistexam.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void initCategories() {
        if (categoryRepository.count() == 0) {
            Arrays.stream(CategoryEnum.values())
                    .forEach(categoryEnum -> {
                        Category category = new Category(categoryEnum,
                                "Description for "+categoryEnum.name());
                        categoryRepository.save(category);
                    });
        }
    }

    @Override
    public Category findByName(CategoryEnum categoryEnum) {
        return categoryRepository.findByName(categoryEnum).orElse(null);
    }
}
