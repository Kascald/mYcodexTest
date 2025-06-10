package com.example.demo.repository;

import com.example.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.repository.OrderRepositoryCustom;

/**
 * Main repository interface for {@link Order}.
 * <p>
 * Extends {@link OrderRepositoryCustom} to expose custom Querydsl queries.
 */

public interface OrderRepository extends JpaRepository<Order, Long>, OrderRepositoryCustom {
}
