package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloColorfulWorldController {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping("/web/helloworld")
    public String greetTheWorld(Model model) {
        int whichHello = (int) (Math.random() * (hellos.length + 1));
        int fontSize = (int) ((Math.random() * (80 + 1)) + 20);
        int red = (int) ((Math.random() * 256));
        int green = (int) ((Math.random() * 256));
        int blue = (int) ((Math.random() * 256));
        model.addAttribute("fontSize", fontSize);
        model.addAttribute("red", red);
        model.addAttribute("green", green);
        model.addAttribute("blue", blue);
        return "worldGreet";
    }
}
