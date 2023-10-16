package com.example.RegisterService.repository;

import com.example.RegisterService.model.Register;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends MongoRepository<Register, String> {
}
