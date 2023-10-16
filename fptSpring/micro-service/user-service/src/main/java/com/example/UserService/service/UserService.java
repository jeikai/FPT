package com.example.UserService.service;

import com.example.UserService.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User findByUsernameAndPassword(String username,String password);
    User registerUser(User user);
    User findById(int id);
}
