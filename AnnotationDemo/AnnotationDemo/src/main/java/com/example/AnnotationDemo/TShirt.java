package com.example.AnnotationDemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TShirt implements Outfit{
    @Override
    public void wear() {
        System.out.println("Đang mặc T-Shirt");
    }
    @PostConstruct
    public void postConstruct() {
        System.out.println("TShirt được khởi tạo thành công");
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("TShirt: hàm này được gọi trước khi Bean bị xoá hoặc ko được quản lý nữa");
    }
}
