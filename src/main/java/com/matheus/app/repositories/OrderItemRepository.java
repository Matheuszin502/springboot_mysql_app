package com.matheus.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.app.entities.OrderItem;
import com.matheus.app.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
}
