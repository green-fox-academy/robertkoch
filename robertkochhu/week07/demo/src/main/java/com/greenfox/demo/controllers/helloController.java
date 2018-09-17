package com.greenfox.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Exercise1 {

    @ResponseBody
    @RequestMapping("/")
    public String index(){
        return "Hello world";
    }
}