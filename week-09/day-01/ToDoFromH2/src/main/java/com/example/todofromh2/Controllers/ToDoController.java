package com.example.todofromh2.Controllers;

import com.example.todofromh2.Repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class ToDoController {
    @Autowired
    private ToDoRepo toDoRepo;

    @RequestMapping(value = {
            "",
            "/list"
    })
    @ResponseBody
    public String list() {
        return "This is my first ToDo.";
    }
}
