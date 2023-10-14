package com.example.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Value("${mysql.url}")
    String url;

    @Bean("User")
    User userConfig() {
        return new User();
    }
    @Bean("Database")
    User databaseConfig() {
        return new User(url);
    }
}
