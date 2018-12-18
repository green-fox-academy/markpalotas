package com.example.todolistwithmysql.Controllers;

//import com.example.todofromh2.Repositories.ToDoRepo;
import com.example.todolistwithmysql.Repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    private ToDoRepo toDoRepo;

    @RequestMapping(value = {
            "",
            "/list"
    })
    public String list(Model model) {
        model.addAttribute("todos", toDoRepo.findAll());
        return "todolist2";
    }
}
