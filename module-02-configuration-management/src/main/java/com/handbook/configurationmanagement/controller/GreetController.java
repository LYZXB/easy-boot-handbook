package com.handbook.configurationmanagement.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @Value("${greeting.message}")
    private String greetMessage;

    @GetMapping("/greet")
    public String greet(){
        return greetMessage;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
