package com.jakedoren.Hospital.Services;

import com.jakedoren.Hospital.Models.Credentials;
import com.jakedoren.Hospital.Models.User;
import com.jakedoren.Hospital.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Component
public class UserService {

    private final UserRepository db;
//    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository db) {
        this.db = db;
//        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(User user) {
//        Optional<User> foundUser = db.findById(user.getId());
//        Credentials userCredentials = user.getCredentials();
//        if(foundUser.isPresent()) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User already exists");
//        }
//        userCredentials.setPw(passwordEncoder.encode(userCredentials.getPw()));
        return db.insert(user);
    }

}


