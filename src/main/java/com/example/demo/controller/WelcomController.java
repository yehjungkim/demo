package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomController {
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        String resultString = "hello world";
        return "hello";
    }
}
