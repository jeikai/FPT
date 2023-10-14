package com.example.Thymeleaf.controller;

import com.example.Thymeleaf.model.User;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class UserController {
    @GetMapping("/") // Nếu người dùng request tới địa chỉ "/"
    public String index() {
        return "index"; // Trả về file index.html
    }

    @GetMapping("/index2")
    public String index2(
            // Request param "name" sẽ được gán giá trị vào biến String
            @RequestParam(name = "name", required = false, defaultValue = "") String name,
            // Model là một object của Spring Boot, được gắn vào trong mọi request.
            Model model) {
        model.addAttribute("name", name);
        return "index2"; // Trả về file index2.html
    }
    @PostMapping("/addUser")
    public String addUser(String name ,Model model) {
        if(name.equals("Phúc")) {
            return "successPost";
        }
        return "index2";
    }
}
