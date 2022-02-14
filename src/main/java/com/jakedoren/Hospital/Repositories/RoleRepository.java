package com.jakedoren.Hospital.Repositories;

import com.jakedoren.Hospital.Models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByName(String name);
}
