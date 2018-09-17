package com.example1.demo1.controller;

import com.example1.demo1.modell.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class greetWithAtomController {

    AtomicLong atomicLong = new AtomicLong(0);
@RequestMapping("/mapAtom")
    public Greeting countUser(){
    return new Greeting(atomicLong.incrementAndGet(),"Robert");

}
}
