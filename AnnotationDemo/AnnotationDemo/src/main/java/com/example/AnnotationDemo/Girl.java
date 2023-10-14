package com.example.AnnotationDemo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    @Autowired
    Outfit outfit;
    private String name;
    public Girl( Outfit anything) {
        this.outfit = anything;
    }
    @PostConstruct
    public void postConstructor() {
        System.out.println("Girl được khởi tạo thành công");
    }
    public Girl() {
        System.out.println("Construct của girl được khởi tạo ko có tham số");
    }
}
