package com.example.JPA.service.Impl;

import com.example.JPA.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBook();
    void delete(int id);
    void save(int categoryId, String title, float price);
}
