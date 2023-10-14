package com.example.JPA.service.Impl;

import com.example.JPA.model.User;
import com.example.JPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByNameAndPassword(String name, String passwod) {
        return userRepository.findByUsernameAndPassword(name, passwod);
    }
}
