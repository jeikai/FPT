package com.example.RegisterService.controller;

import com.example.RegisterService.model.Register;
import com.example.RegisterService.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterController {
    private final RegisterService registerService;
    @PostMapping("/register/DK")
    @ResponseStatus(HttpStatus.CREATED)
    public String DangKiem(@RequestBody Register registerRequest) {
        System.out.println("In route");
        return registerService.DangKiem(registerRequest);
    }
}
