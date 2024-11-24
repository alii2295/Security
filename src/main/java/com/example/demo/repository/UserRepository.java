package com.example.demo.repository;


import com.example.demo.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
    User findUserByEmail(String email);
    boolean existsByEmail(String email);
}


