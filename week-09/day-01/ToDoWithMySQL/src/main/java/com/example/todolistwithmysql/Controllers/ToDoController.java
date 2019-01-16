package com.example.todolistwithmysql.Controllers;

//import com.example.todofromh2.Repositories.ToDoRepo;
import com.example.todolistwithmysql.Model.ToDo;
import com.example.todolistwithmysql.Repositories.ToDoRepo;
import com.example.todolistwithmysql.Services.ToDoService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

//    @Autowired
//    private ToDoRepo toDoRepo;

    @RequestMapping(value = {
            "",
            "/list"
    })
    public String list(Model model, @RequestParam(value = "isActive", required = false) final String isActive, @RequestParam(value = "isUrgent", required = false) final String isUrgent) {
        if (isActive == null && isUrgent == null) {
            model.addAttribute("todos", toDoService.getAll());
        } else if (isActive == null && isUrgent.equals("true")) {
            model.addAttribute("todos", toDoService.findByUrgent(true));
        } else if (isActive == null && isUrgent.equals("false")) {
            model.addAttribute("todos", toDoService.findByUrgent(false));
        } else if (isActive.equals("true") && isUrgent == null) {
            model.addAttribute("todos", toDoService.findByDone(true));
        } else if (isActive.equals("false") && isUrgent == null) {
            model.addAttribute("todos", toDoService.findByDone(false));
        } else if (isActive.equals("true") && isUrgent.equals("true")) {
            model.addAttribute("todos", toDoService.findByDoneAndUrgent(true, true));
        } else if (isActive.equals("false") && isUrgent.equals("false")) {
            model.addAttribute("todos", toDoService.findByDoneAndUrgent(false, false));
        } else if (isActive.equals("true") && isUrgent.equals("false")) {
            model.addAttribute("todos", toDoService.findByDoneAndUrgent(true, false));
        } else if (isActive.equals("false") && isUrgent.equals("true")) {
            model.addAttribute("todos", toDoService.findByDoneAndUrgent(false, true));
        } else {
            return "invalidReqParam";
        }
        return "todolist2";
    }

    @GetMapping(value = "/add")
    public String addToDo(Model model, @ModelAttribute("todo") ToDo todo) {
        model.addAttribute("todo", todo);
        return "addtodoform";
    }

    @PostMapping (value = "/add")
    public String addToDo(@ModelAttribute("todo") ToDo todo) {
        toDoService.save(todo);
        return "redirect:/todo";
    }

    @GetMapping(value = "/{id}/delete")
    public String deleteToDo(@PathVariable Long id) {
        toDoService.delete(id);
        return "redirect:/todo";
    }

    @GetMapping(value = "/{id}/edit")
    public String editToDo(Model model, @PathVariable Long id) {
        model.addAttribute("todo", toDoService.get(id));
        return "edittodoform";
    }

    @PostMapping(value = "/{id}/edit")
    public String editToDo(@ModelAttribute("todoMod") ToDo toDo) {
        toDoService.save(toDo);
        return "redirect:/todo";
    }
}
