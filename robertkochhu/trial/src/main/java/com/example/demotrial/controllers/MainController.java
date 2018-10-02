package com.example.demotrial.controllers;

import com.example.demotrial.repositories.MatrixRepository;
import com.example.demotrial.services.ImpMatrixService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    ImpMatrixService impMatrixService;

    public MainController(ImpMatrixService impMatrixService) {
        this.impMatrixService = impMatrixService;
    }


    @GetMapping("/index")
    public String indexPage(){
        return "index";
    }

    @PostMapping("/add")
    public String incomingMatrix(String inputMatrix){
    impMatrixService.create(inputMatrix);
        return ("redirect:/index");
    }

}

