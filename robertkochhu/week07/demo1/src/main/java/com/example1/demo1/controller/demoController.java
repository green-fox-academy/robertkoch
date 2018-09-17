package com.example1.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demoController {
    @RequestMapping("/home")
    @ResponseBody
    public String demoString(){
        return "Hello wolrd";
    }
}
