package com.example.RegisterService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "register")
//Tạo 1 constructor chấp nhận tất cả các arg
@AllArgsConstructor
// Tạo constructor không có arg
@NoArgsConstructor
// Tạo build pattern cho lớp
@Builder
// Tự động tạo getter setter
@Data
public class Register {
    @Id
    private String id;
    private int userId;
    private String registerDate;
    private String plateNumber;
}
