package com.example.shopinglistexam.model.entity;

import com.example.shopinglistexam.model.entity.enums.CategoryEnum;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CategoryEnum name;
    @Column(columnDefinition = "TEXT")
    private String description;

    public Category(){}

    public Category(CategoryEnum name, String description) {
        this.name = name;
        this.description = description;
    }

    public CategoryEnum getName() {
        return name;
    }

    public void setName(CategoryEnum name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
