package com.matheus.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.app.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
