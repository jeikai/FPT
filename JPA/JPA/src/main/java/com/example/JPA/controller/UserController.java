package com.example.JPA.controller;

import com.example.JPA.model.User;
import com.example.JPA.service.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Objects;

@Controller
public class UserController {

    @Autowired
    UserService iUserService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/submit")
    public String submit(String username, String password, Model model) {
        User user = iUserService.getUserByNameAndPassword(username, password);
        if (Objects.isNull(user)) {
            model.addAttribute("message", "Please enter correct username and password to login");
            return "login";
        }
        return "redirect:home";
    }

}
