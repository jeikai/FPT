package com.example.UserService.service;

import com.example.UserService.model.User;
import com.example.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
    public User findByUsernameAndPassword(String username,String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public User registerUser(User user) {
        // Kiểm tra xem người dùng có tồn tại trong cơ sở dữ liệu chưa
        User existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser != null) {
            throw new RuntimeException("Username already exists");
        }

        // Gán một vai trò mặc định cho người dùng (nếu có)
        user.setRolebit("user");

        // Lưu người dùng mới vào cơ sở dữ liệu
        return userRepository.save(user);
    }

    public User findById(int id) {
        return userRepository.findById(id);
    }

}
