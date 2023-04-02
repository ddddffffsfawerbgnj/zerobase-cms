package com.example.userapi.client.service;

import com.example.userapi.client.MailgunClient;
import com.example.userapi.client.mailgun.SendMailForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSendServiceTest {

    @Autowired
    private MailgunClient mailgunClient;

    @Test
    public void EmailTest() {
        // need test code
        SendMailForm form = SendMailForm.builder()
                .from("zerobase@test.com")
                .to("dmstndi12@gmail.com")
                .subject("test")
                .text("test")
                .build();
        String response = mailgunClient.sendEmail(form).getBody();
        System.out.println(response);
    }
}