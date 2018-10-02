package com.simbabank.simbaaa.controllers;

import com.simbabank.simbaaa.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class multiController {
    List<BankAccount> list = new ArrayList<>();

    @RequestMapping("/multiAccount")
    public String multiAccountShow(Model model) {
        list.add(new BankAccount("Vuk", 100, "fox", false, true));
        list.add(new BankAccount("Frakk", 1100, "dog", false, false));
        list.add(new BankAccount("MekkElek", 0, "goat", false, true));
        list.add(new BankAccount("Pumba", 999, "Phacochoerus aethiopicus", true, true));
        model.addAttribute("list", list);
        return "multiAccount";
    }
}
