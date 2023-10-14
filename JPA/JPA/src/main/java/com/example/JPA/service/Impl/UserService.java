package com.example.JPA.service.Impl;

import com.example.JPA.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserByNameAndPassword(String name, String passwod);
}
