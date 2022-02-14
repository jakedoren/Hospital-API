package com.jakedoren.Hospital.Services;

import com.jakedoren.Hospital.Models.Role;
import com.jakedoren.Hospital.Models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
