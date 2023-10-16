package com.example.JPA.repository;

import com.example.JPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsernameAndPassword(String name, String password);
    User findByUsername(String name);
}
