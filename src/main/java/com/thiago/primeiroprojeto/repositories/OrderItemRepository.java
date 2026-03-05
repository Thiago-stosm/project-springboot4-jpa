package com.thiago.primeiroprojeto.repositories;

import com.thiago.primeiroprojeto.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
