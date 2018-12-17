package com.example.todofromh2.Controllers;

import com.example.todofromh2.Model.ToDo;
//import com.example.todofromh2.Repositories.ToDoRepo;
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
//    @Autowired
//    private ToDoRepo toDoRepo;

    @RequestMapping(value = {
            "",
            "/list"
    })
    public String list(Model model) {
        ToDoList toDoList1 = new ToDoList();
        model.addAttribute("todos", toDoList1.toDoList);
        return "todolist";
    }
}
