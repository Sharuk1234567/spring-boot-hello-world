package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sendGreetings() {
<<<<<<< HEAD
        return "Hello, World! testing";
=======
        return "Hello, World! testing the code project2";
>>>>>>> 1a7df2e (new code added)
    }
}
