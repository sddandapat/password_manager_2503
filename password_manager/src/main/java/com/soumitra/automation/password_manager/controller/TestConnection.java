package com.soumitra.automation.password_manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConnection {

    @GetMapping("/test")
    public String greet() {
        return "Hello world!";
    }

}

