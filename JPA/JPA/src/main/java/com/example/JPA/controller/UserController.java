package com.example.JPA.controller;

import com.example.JPA.model.User;
import com.example.JPA.service.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserService iUserService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model) {
        User user = iUserService.getUserByNameAndPassword(username, password);
        model.addAttribute("users", iUserService.getAllUser());
        if (user != null) {
            return "home";
        } else {
            return "errorScreen";
        }

    }

}
