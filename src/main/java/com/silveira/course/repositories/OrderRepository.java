package com.silveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silveira.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
