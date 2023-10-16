package com.example.UserService.controller;

import com.example.UserService.model.User;
import com.example.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
//@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/user/login")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String login(@RequestBody User userRequest) {
        String username = userRequest.getUsername();
        String password = userRequest.getPassword();
        User result = userService.findByUsernameAndPassword(username, password);

        if (result != null) {
            return "Login Success";
        } else {
            return "Login failed"; // Hoặc trả về bất kỳ thông báo lỗi nào bạn muốn
        }
    }
    @PostMapping("/user/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> registerUser(@RequestBody User userRequest) {
        try {
            User registeredUser = userService.registerUser(userRequest);
            return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>("Registration failed: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("user/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAll() {
        return userService.getAll();
    }
}

