package com.example.JPA.service.Impl;

import com.example.JPA.model.Book;
import com.example.JPA.model.Category;
import com.example.JPA.repository.BookRepository;
import com.example.JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository bookRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public void delete(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void save(int categoryId, String title, float price) {
        Book book = new Book();
        book.setPrice(price);
        book.setTitle(title);
        //Optional dùng để check xem có null hay khong
        Optional<Category> categoryOtp = categoryRepository.findById(categoryId);
        //Trích xuất giá trị từ optional nếu rỗng thì null được tra ve
        book.setCategory(categoryOtp.orElse(null));
        bookRepository.save(book);
    }
}
