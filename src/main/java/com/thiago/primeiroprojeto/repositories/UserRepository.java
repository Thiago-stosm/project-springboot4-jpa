package com.thiago.primeiroprojeto.repositories;

import com.thiago.primeiroprojeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
