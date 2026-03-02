package com.thiago.primeiroprojeto.repositories;

import com.thiago.primeiroprojeto.entities.Category;
import com.thiago.primeiroprojeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
