package com.matheus.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.app.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
