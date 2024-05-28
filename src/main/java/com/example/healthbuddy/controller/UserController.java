package com.example.healthbuddy.controller;

import com.example.healthbuddy.domain.User;
import com.example.healthbuddy.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;


    @PostMapping("/users")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        User newUser = userService.register(user);
        return ResponseEntity.ok(newUser);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user) {
        User existUser = userService.findByEmail(user.getEmail());
        if (existUser != null && passwordEncoder.matches(user.getPassword(), existUser.getPassword())) {
            return ResponseEntity.ok(existUser);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}

