package com.h2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloLController {
    @GetMapping("/hello")   
    public String sayHello() {
        return "Hello, Spring Boot Application!";
     }
}
