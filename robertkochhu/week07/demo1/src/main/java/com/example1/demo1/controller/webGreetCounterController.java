package com.example1.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class webGreetCounterController {
    AtomicLong atomicLong = new AtomicLong(0);

    @RequestMapping("/web/greetingcounter")
    public String greeting(Model model, @RequestParam("name") String name) {
        model.addAttribute("name", name + " This site was loaded " +
                atomicLong.getAndIncrement() + " times since last server start.");
        return "greetingcounter";
    }
}
