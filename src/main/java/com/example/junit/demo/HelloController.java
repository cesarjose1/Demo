package com.example.junit.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/Torres")
    public String indexCesar() {
        return "Greetings from Spring Boot! by CESAR";
    }
}
