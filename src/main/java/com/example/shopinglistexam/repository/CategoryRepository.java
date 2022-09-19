package com.example.shopinglistexam.repository;

import com.example.shopinglistexam.model.entity.Category;
import com.example.shopinglistexam.model.entity.enums.CategoryEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.OptionalInt;

@Repository
public interface CategoryRepository extends JpaRepository<Category,String> {

    Optional<Category>findByName(CategoryEnum name);
}
