package com.example.demo.repository;

import com.example.demo.dto.OrderProjection;
import java.util.List;

public interface OrderRepositoryCustom {
    List<OrderProjection> findOrderWithRelations();
}
