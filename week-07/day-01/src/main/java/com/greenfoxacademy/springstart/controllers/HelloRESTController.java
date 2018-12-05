package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong atomicId = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam("name") String name) {
        return new Greeting(atomicId.getAndAdd(1), name);
    }
}
