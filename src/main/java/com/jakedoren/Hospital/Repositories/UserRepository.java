package com.jakedoren.Hospital.Repositories;

import com.jakedoren.Hospital.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends MongoRepository<User, String> {

}