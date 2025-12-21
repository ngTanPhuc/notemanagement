package com.ngtanphuc.notemanagement.controller;

import com.ngtanphuc.notemanagement.model.User;
import com.ngtanphuc.notemanagement.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController  // tells that this class is a web handler
@RequestMapping("/api/auth")  // create entry point /api/auth
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user){
        userService.registerUser(user);
        return ResponseEntity.ok("Registered successfully");
    }
}
