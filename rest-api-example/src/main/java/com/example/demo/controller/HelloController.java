
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.GreetingResponse;
import com.example.demo.model.User;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/greet")
     public GreetingResponse greet(@RequestBody User user) {
        String msg= "Hello, " + user.getName() + " (Email: " + user.getEmail() +")";
        return new GreetingResponse(msg);
     }
}
