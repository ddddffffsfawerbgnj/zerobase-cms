package com.example.userapi.service;

import com.example.userapi.domain.SignUpForm;
import com.example.userapi.domain.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SignUpCustomerServiceTest {

    @Autowired
    private SignUpCustomerService service;

    @Test
    void signUp() {
        SignUpForm form = SignUpForm.builder()
                .name("name")
                .birth(LocalDate.now())
                .email("abc@naver.com")
                .password("1")
                .phone("01000000000")
                .build();
        Customer c = service.signUp(form);

        assertNotNull(c.getId());
        assertNotNull(c.getCreatedAt());
    }
}