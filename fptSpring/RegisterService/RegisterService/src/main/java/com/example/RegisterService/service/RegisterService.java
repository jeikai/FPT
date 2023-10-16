package com.example.RegisterService.service;

import com.example.RegisterService.model.Register;
import com.example.RegisterService.repository.RegisterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RegisterService {
    private final RegisterRepository registerRepository;
    public String DangKiem(Register registerRequest) {
        Register register = Register.builder()
                .userId(registerRequest.getUserId())
                .registerDate(registerRequest.getRegisterDate())
                .plateNumber(registerRequest.getPlateNumber())
                .build();
        registerRepository.save(register);
        return "Đăng kiểm thành công";
    }
}
