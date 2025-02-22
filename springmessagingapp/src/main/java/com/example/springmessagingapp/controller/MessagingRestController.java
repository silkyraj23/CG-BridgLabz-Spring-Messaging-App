package com.example.springmessagingapp.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MessagingRestController {
    @GetMapping
    public String hello(){
        return "Hello From BridgeLabz";
    }

    @GetMapping("/web")
    public String hello2(@RequestParam String name){
        return  "Hello " + name +" , Welcome to BridgeLabz!";
    }

    @GetMapping("/{name}")
    public String hello3(@PathVariable String name){
        return  "Hello " + name +" , Welcome to BridgeLabz!";
    }

    @PostMapping("/post")
    public String hello4(@RequestBody UserDTO user){

        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
    @PutMapping("/put/{firstName}")
    public String hello5(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }




}
