package com.example.AnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class Shirt implements Outfit {
    @Override
    public void wear() {
        System.out.println("Đang mặc shirt");
    }
}
