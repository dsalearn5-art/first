package com.example.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class PNRController {

    @GetMapping("/msg")
    public String helloJava(){
        return "Hello Harshal";
    }
}
