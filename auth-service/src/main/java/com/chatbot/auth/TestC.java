package com.chatbot.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/test")
public class TestC {
    @GetMapping
    public String test(){
        return "test";
    }
}
