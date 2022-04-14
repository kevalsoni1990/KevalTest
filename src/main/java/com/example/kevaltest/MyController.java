package com.example.kevaltest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/welcome-app")
    public String getWelcome(){
        return "My first Application updated --- 22221";
    }
}
