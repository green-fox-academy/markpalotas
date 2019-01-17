package com.todoapprevisited.todoappretake.Controllers;

import com.todoapprevisited.todoappretake.Model.Assignee;
import com.todoapprevisited.todoappretake.Model.Todo;
import com.todoapprevisited.todoappretake.Services.AssigneeService;
import com.todoapprevisited.todoappretake.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

    TodoService todoService;
    AssigneeService assigneeService;

    @Autowired
    public AssigneeController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = {"", "/list"})
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeService.getAll());
        return "assigneelist";
    }

    @GetMapping(value = "/add")
    public String addAssignee(Model model, @ModelAttribute("assignee") Assignee assignee) {
        model.addAttribute("assignee", assignee);
        return "addassigneeform";
    }

    @PostMapping("/add")
    public String addAssignee(@ModelAttribute("assignee") Assignee assignee) {
        assigneeService.save(assignee);
        return "redirect:/assignee";
    }
}
