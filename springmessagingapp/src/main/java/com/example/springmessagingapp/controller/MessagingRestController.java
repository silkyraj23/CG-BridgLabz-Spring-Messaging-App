package com.example.springmessagingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MessagingRestController {
    @GetMapping
    public String hello(){
        return "Hello From BridgeLabz";
    }

    @GetMapping("/")
    public String hello2(@RequestParam String name){
        return  "Hello " + name +" , Welcome to BridgeLabz!";
    }

    @GetMapping("/{name}")
    public String hello3(@PathVariable String name){
        return  "Hello " + name +" , Welcome to BridgeLabz!";
    }

}
