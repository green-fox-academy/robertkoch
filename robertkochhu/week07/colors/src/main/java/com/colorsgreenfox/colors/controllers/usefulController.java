package com.colorsgreenfox.colors.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class usefulController {
    public usefulController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful")

    public String useful() {
        return ("useful");
    }

    public UtilityService getUtilityService() {
        return utilityService;
    }

    UtilityService utilityService;

    @RequestMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return ("colored");
    }

    public void setUtilityService(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful/email")
    public String emailValid(Model model, @RequestParam("email") String emailAdress) {
        boolean emailChecker = utilityService.validEmail(emailAdress);
        model.addAttribute("emailname", emailAdress);
        model.addAttribute("email", emailChecker);
        return "email";
    }

    @RequestMapping("/useful/decoder")
    public String decoderStuff(Model model, @RequestParam("text") String text, @RequestParam("number") int number) {
        return "decoder";
    }
}
