package greenfox.tourist.controllers;

import greenfox.tourist.models.Attraction;
import greenfox.tourist.services.AttractionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    AttractionService attractionService;

    public MainController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping("/")
    public String mainFunction(Model model) {
        Iterable<Attraction> attractionList = attractionService.findAll();
        model.addAttribute("attractions", attractionList);
        return "main";
    }

    @PostMapping("/add")
    public String addFunction() {
        return ("redirect:/");
    }
}
