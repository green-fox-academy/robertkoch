package com.simbabank.simbaaa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLception {
    @RequestMapping("/html")
    public String htmlCeptioner(Model model){
        model.addAttribute("html","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "html";
    }
}
