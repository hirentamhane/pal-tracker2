package com.paltracker.hdt1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {
    @GetMapping("/")
    public String hellow(){
        return "hellow";
    }
}
