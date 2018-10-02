package com.roka.rokaapp.controllers;

import com.roka.rokaapp.models.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.soap.Addressing;

@Controller
public class MainController {
    TaskRepository taskRepository;

    public MainController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @RequestMapping("/index")
    public String controller(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("name1", taskRepository.printFox());
        return "index";

    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(String name, Model model) {
        taskRepository.addFox(name);
        if (name.length() == 0) {
            return "redirect:/login";
        }
        taskRepository.addFox(name);
        return "redirect:/index?name=" + name;
    }

    @RequestMapping("/nutrition")
    public String nutrition(Model model) {
        model.addAttribute("nutri", "Hi, this is a store");

        return "nutrition";
    }
}
