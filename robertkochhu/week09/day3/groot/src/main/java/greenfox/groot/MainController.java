package greenfox.groot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/groot")
    public ResponseEntity<GrootTranslate> translateFunction(@RequestParam(value = "message", required = false) String message) {
        if (message == null) {
            return new ResponseEntity(new GrootTranslate("I am Groot!"), HttpStatus.BAD_REQUEST);
        } else return new ResponseEntity(new GrootTranslate(message, "I am Groot!"), HttpStatus.OK);
    }

    @GetMapping("/yondu")
    public ResponseEntity<Arrow> arrowFunction(@RequestParam(value = "distance") Integer distance, @RequestParam(value = "time") Integer time) {
        return new ResponseEntity(new Arrow(distance,time), HttpStatus.OK);
    }
}
