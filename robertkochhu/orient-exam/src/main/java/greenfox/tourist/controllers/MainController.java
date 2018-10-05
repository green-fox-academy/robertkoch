package greenfox.tourist.controllers;

import greenfox.tourist.models.Attraction;
import greenfox.tourist.services.AttractionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String addFunction(String nameInput, String cityInput, String priceInput, String longitudeInput,
                              String latitudeInput, String categoryInput, String durationInput, String recommandedAgeInput) {
        attractionService.create(nameInput, cityInput, priceInput, longitudeInput, latitudeInput, categoryInput, durationInput, recommandedAgeInput);
        return ("redirect:/");
    }

    @GetMapping("/edit/{id}")
    public String editFunction(@PathVariable(value = "id") long id) {
        return ("redirect:/");
    }

    @GetMapping("/budge")
    @ResponseBody
    public Attraction budgeFunction(){
        return null;
    }

}
