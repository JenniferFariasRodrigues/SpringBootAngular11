package com.jennifer.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloControler {

    @GetMapping(value="/")
    public String getMethodName() {
        return "Hi beautiful people! You look so nice!";
    }
    
    
}
