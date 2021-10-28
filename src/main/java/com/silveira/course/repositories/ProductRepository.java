package com.silveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silveira.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
