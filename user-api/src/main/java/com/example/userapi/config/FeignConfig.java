package com.example.userapi.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

@Configuration
public class FeignConfig {

    @Qualifier(value = "mailgun")
    @Bean
    public BasicAuthenticationInterceptor basicAuthenticationInterceptor(){
        return new BasicAuthenticationInterceptor("api",
                "410e6b54f25a807ec7896b1c22c9aa91-30344472-310b7702");
    }
}
