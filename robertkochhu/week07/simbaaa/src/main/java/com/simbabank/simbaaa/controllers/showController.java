package com.simbabank.simbaaa.controllers;

import com.simbabank.simbaaa.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class showController {
    @RequestMapping("/show")
    BankAccount bankAccount = new BankAccount("Simba",2000,)
}
