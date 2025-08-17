package com.matheus.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.app.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
