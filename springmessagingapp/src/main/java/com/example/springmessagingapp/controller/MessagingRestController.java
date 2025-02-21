package com.example.springmessagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MessagingRestController {
    @GetMapping
    public String hello(){
        return "Hello From BridgeLabz";
    }


}
