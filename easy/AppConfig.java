package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        return new Course("Spring Boot", 3);
    }

    @Bean
    public Student student() {
        return new Student("Alice", course());
    }
}
