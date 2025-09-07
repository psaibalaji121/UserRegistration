package com.example.userregistration.repository;

import com.example.userregistration.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepsitory extends MongoRepository<User, String> {
}
