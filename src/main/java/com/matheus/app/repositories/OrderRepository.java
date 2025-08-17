package com.matheus.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.app.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
