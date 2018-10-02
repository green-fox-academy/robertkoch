package com.gf.log.controllers;

import com.gf.log.models.Log;
import com.gf.log.models.Repo;
import com.gf.log.services.LogService;
import com.greenfox.workshop.models.Doubling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class controller {
    LogService logService;

    public controller(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/doubling")
    public Doubling doubleNumber(@RequestParam(value = "input", required = false) String input) {
        logService.save(new Log("/doubling", "input =" + input));
        if (input == null) {
            return new Doubling("Please provide an input!");
        }

        return new Doubling(Integer.parseInt(input), Integer.parseInt(input) * 2);
    }
    /*@GetMapping("/log")
    public Repo listAll(){
        return Repo ;
    }*/
}
