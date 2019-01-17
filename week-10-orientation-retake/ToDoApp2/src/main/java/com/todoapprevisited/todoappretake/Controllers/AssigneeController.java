package com.todoapprevisited.todoappretake.Controllers;

import com.todoapprevisited.todoappretake.Exceptions.AssigneeNotFoundException;
import com.todoapprevisited.todoappretake.Model.Assignee;
import com.todoapprevisited.todoappretake.Services.AssigneeService;
import com.todoapprevisited.todoappretake.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}/delete")
    public String deleteAssignee(@PathVariable("id") Long id) throws AssigneeNotFoundException {
        assigneeService.delete(assigneeService.findById(id));
        return "redirect:/assignee/list";
    }

    @GetMapping("/{id}/edit")
    public String updateAssignee(Model model, @PathVariable("id") Long id) throws AssigneeNotFoundException {
        model.addAttribute("assignee", assigneeService.findById(id));
        return "editassigneeform";
    }

    @PostMapping("/{id}/edit")
    public String updateAssignee(@ModelAttribute("assignee") Assignee assignee) {
        assigneeService.save(assignee);
        return "redirect:/assignee/list";
    }

    @ExceptionHandler(AssigneeNotFoundException.class)
    @ResponseBody
    public String assigneeNotFound() {
        return "Assignee not found";
    }
}

