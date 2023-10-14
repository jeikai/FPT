package com.example.Configuration;

public class User {
    private String name;

    public User() {
        System.out.println("Khởi tạo User ko arg");
    }
    public User(String url) {
        System.out.println("URL Database: " + url);
    }
    @Override
    public String toString() {
        return "Hi, this is " + name;
    }
}
