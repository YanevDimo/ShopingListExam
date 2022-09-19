package com.example.shopinglistexam.model.serviceModel;
import com.example.shopinglistexam.model.entity.enums.CategoryEnum;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductServiceModel {

    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime neededBefore;
    private CategoryEnum category;

    public ProductServiceModel() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDateTime getNeededBefore() {
        return neededBefore;
    }

    public CategoryEnum getCategory() {
        return category;
    }
}
