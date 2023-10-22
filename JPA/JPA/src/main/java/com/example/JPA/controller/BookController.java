package com.example.JPA.controller;

import com.example.JPA.service.Impl.BookService;
import com.example.JPA.service.Impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @Autowired
    CategoryService categoryService;

    @GetMapping(value = {"/", "/list"})
    public String homepage(Model model) {
        model.addAttribute("lstBook", bookService.getAllBook());
        return "book";
    }
    @GetMapping("/insert")
    public String insert(Model model) {
        model.addAttribute("categoryList", categoryService.findAll());
        return "newBook";
    }

    @PostMapping("/insert")
    public String insertPost(int categoryId, String title, float price, Model model) {
        bookService.save(categoryId, title, price);
        model.addAttribute("lstBook", bookService.getAllBook());
        return "book";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model) {
        bookService.delete(id);
        model.addAttribute("lstBook", bookService.getAllBook());
        return "book";
    }
}
