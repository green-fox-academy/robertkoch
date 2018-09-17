package com.example1.demo1.controller;

import com.example1.demo1.modell.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class requestparam {
    @RequestMapping("/greeting")
    public Greeting greetUser(@RequestParam("name")String name){
        return new Greeting(2,name);
    }
}
