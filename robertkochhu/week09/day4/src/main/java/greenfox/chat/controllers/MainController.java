package greenfox.chat.controllers;

import greenfox.chat.dto.ReceivedJSON;
import greenfox.chat.models.Message;
import greenfox.chat.services.MessageService;
import greenfox.chat.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class MainController {
    UserService userService;
    MessageService messageService;

    public MainController(UserService userService, MessageService messageService) {
        this.userService = userService;
        this.messageService = messageService;
    }

    @GetMapping("/")
    public String index(Model model) {
        if (userService.isThereAnyone() == true) {
            model.addAttribute("messages",messageService.listAll());
            model.addAttribute("username1",userService.userFinder());
            return ("index");
        } else return "redirect:/register";
    }

    @GetMapping("/register")
    public String register(@RequestParam(required = false) String error, Model model) {
        model.addAttribute("error", error);
        return "register";
    }

    @PostMapping("/register")
    public String register(String username) {
        if (username == null || username.isEmpty()) {
            return ("redirect:/register?error=FieldisEmpty");
        }
        userService.save(username);
        return ("redirect:/");
    }

    @PostMapping("/update-username")
    public String updateFunction(String updateName) {
        userService.update(updateName);
        return ("redirect:/");
    }

    @PostMapping("/send")
    public String sendFunction(Message message) {
        messageService.save(message);
        return ("redirect:/");
    }
    @PostMapping("/api/message/receive")
    @ResponseBody
    public ResponseEntity<ResponseJSON> getMessage(@Valid @RequestBody ReceivedJSON receivedJSON) {
        ResponseJSON r = new ResponseJSON();
        if (receivedJSON.getMessage() == null || receivedJSON.getClient() == null) {
            r.status = "error";
            r.message = "Missing client or message";
            return new ResponseEntity<>(r, HttpStatus.UNAUTHORIZED);
        }
        r.status = "ok";
        messageService.save(receivedJSON.getMessage());
        messageService.forwardReceivedJSON(receivedJSON);
        return new ResponseEntity<>(r, HttpStatus.OK);
    }
    static class ResponseJSON {
        public String status;
        public String message;
    }
}
