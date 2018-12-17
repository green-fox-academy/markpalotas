package com.example.todofromh2.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    @RequestMapping(value = {
            "",
            "/list"
    })
    @ResponseBody
    public String list() {
        return "This is my first ToDo.";
    }
}
