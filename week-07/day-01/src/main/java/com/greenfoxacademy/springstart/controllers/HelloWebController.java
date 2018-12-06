package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong atomicCounter = new AtomicLong(1);

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        model.addAttribute("counter", atomicCounter.getAndAdd(1));
        return "greeting";
    }
}
