package com.example.RegisterService.service;

import com.example.RegisterService.model.Register;
import com.example.RegisterService.repository.RegisterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
@Slf4j
public class RegisterService {
    private final RegisterRepository registerRepository;
    private final WebClient webClient;

    public String DangKiem(Register registerRequest) {
        Register register = Register.builder()
                .userId(registerRequest.getUserId())
                .registerDate(registerRequest.getRegisterDate())
                .plateNumber(registerRequest.getPlateNumber())
                .build();
        Boolean result = webClient.get().uri("http://localhost:8081/user/findUser/" + registerRequest.getUserId()).retrieve().bodyToMono(Boolean.class).block();
        if (result) {
            registerRepository.save(register);
            return "Đăng kiểm thành công";
        } else {
            return "User Id không tồn tại";
        }

    }
}
