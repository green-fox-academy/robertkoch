package com.example1.demo1.controller;

import com.example1.demo1.modell.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloRESTController {
    @RequestMapping("/greetin")
    public Greeting doGreeting(){
        Greeting greeting = new Greeting(1,"Hello, World");
        return greeting;
    }

}
