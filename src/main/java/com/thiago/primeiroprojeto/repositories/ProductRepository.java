package com.thiago.primeiroprojeto.repositories;

import com.thiago.primeiroprojeto.entities.Category;
import com.thiago.primeiroprojeto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
