package com.thiago.primeiroprojeto.repositories;

import com.thiago.primeiroprojeto.entities.Order;
import com.thiago.primeiroprojeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
