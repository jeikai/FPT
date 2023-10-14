package com.product.fptSpring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

//Collection name
@Document(value = "product")
//Tạo 1 constructor chấp nhận tất cả các arg
@AllArgsConstructor
// Tạo constructor không có arg
@NoArgsConstructor
// Tạo build pattern cho lớp
@Builder
// Tự động tạo getter setter
@Data
public class Product {
    // Đánh dấu khoá chính
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
