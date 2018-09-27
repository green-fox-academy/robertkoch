package controller;

import service.UserService;
import com.greenfox.error.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {
    UserService userservice;

    public AppController(UserService userservice) {
        this.userservice = userservice;
    }

    @GetMapping("/index")
    public String index(Model model,User user) {
        model.addAttribute("new_user", user);
        model.addAttribute("yolo", userservice.getAll());
        return "index";
    }

    @PostMapping("/app")
    public String create(User user) {
        userservice.save(user);
        return "redirect:/index";
    }
}