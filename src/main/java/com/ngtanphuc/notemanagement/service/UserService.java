package com.ngtanphuc.notemanagement.service;

import com.ngtanphuc.notemanagement.model.User;
import com.ngtanphuc.notemanagement.repo.UserRepo;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepo userRepo;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User registerUser(User user) {
        String pwd = user.getPassword();
        user.setPassword(passwordEncoder.encode(pwd));
        return userRepo.save(user);
    }
}
