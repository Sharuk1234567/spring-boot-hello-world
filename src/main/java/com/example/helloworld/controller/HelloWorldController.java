package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sendGreetings() {
         return "Hello, World! testing the code project2, monitoring on grafana, Azure-DevOps working on new project, new task in-progress";

    }
}
