package com.greenfox.workshop.controllers;

import com.greenfox.workshop.models.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/doubling")
    public Doubling doubleNumber(@RequestParam(value = "input", required = false) String input) {
        if (input == null) {
            return new Doubling("Please provide an input!");
        }
        return new Doubling(Integer.parseInt(input), Integer.parseInt(input) * 2);
    }

    @GetMapping("/greeter")
    public Greeting greetingFunction(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        if (name.isEmpty() || title.isEmpty()) {
            return new Greeting(null, "Please provide an input!");
        }
        return new Greeting("Oh, hi there " + name + ", my dear " + title + "!");
    }

    @GetMapping("/appenda/{appendable}")
    public Append appendFunction(@PathVariable("appendable") String appendable) {
        return new Append(appendable);
    }

    @PostMapping("/dountil/{action}")
    public Result doUntilFunction(@PathVariable String action, @RequestBody DoUntil until) {
        if (action.equals("sum")) {
            int sum = 0;
            for (int i = 1; i <= until.getUntil(); i++) {
                sum = sum + i;
            }
            Result result = new Result(sum);
            return result;
        }
        if (action.equals("factor")) {
            int factorsum = 1;
            for (int j = 1; j <= until.getUntil(); j++) {
                factorsum = factorsum * j;
            }
            Result result = new Result(factorsum);
            return result;
        } else return new Result("Error");
    }
    @PostMapping("/arrays")
    public Result caculation(@RequestBody Array what){
        if(what.getWhat().equals("sum")){
            int sum=0;
            for(int i =0;i<what.getNumbers().length;i++){
                sum=sum+what.getNumbers()[i];
            }
            return new Result(sum);
        }
        if(what.getWhat().equals("multiply")){
            int multiSum=1;
            for(int j=0;j<what.getNumbers().length;j++){
                multiSum=multiSum*what.getNumbers()[j];
            }
            return new Result(multiSum);
        }
        else return new Result("Please provide what to do with the numbers!");
    }
}
