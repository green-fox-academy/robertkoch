package com.simbabank.simbaaa.controllers;

import com.simbabank.simbaaa.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class showController {

    @RequestMapping("/show")
    public String showBankAccount(Model model) {
        BankAccount bankAccountOfSimba = new BankAccount("Simba", 2000, "lion");
        model.addAttribute("simbaInfo", bankAccountOfSimba);
        return "show";
    }

}
