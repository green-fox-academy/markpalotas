package com.todoapprevisited.todoappretake.Controllers;

import com.todoapprevisited.todoappretake.Exceptions.TodoNotFoundException;
import com.todoapprevisited.todoappretake.Model.Todo;
import com.todoapprevisited.todoappretake.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

//    @RequestMapping(value = {"", "/list"})
//    public String list(Model model) {
//        model.addAttribute("todos", todoService.getAll());
//        return "todolisttable";
//    }

    @RequestMapping(value = {"", "/list"})
    public String list(@RequestParam(value = "isActive", required = false) final String isActive, Model model) {
        if (isActive == null) {
            model.addAttribute("todos", todoService.getAll());
        } else if (isActive.equals("true")) {
            model.addAttribute("todos", todoService.getByActive(true));
        } else if (isActive.equals("false")) {
            model.addAttribute("todos", todoService.getByActive(false));
        }
        return "todolisttable";
    }

    @GetMapping(value = "/add")
    public String addTodo(Model model, @ModelAttribute("todo") Todo todo) {
        model.addAttribute("todo", todo);
        return "addtodoform";
    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute("todo") Todo todo) throws TodoNotFoundException {
        todoService.save(todo);
        return "redirect:/todo";
    }

    @GetMapping("/{id}/delete")
    public String deleteTodo(@PathVariable("id") Long id) throws TodoNotFoundException {
        todoService.delete(todoService.findById(id));
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String updateTodo(Model model, @PathVariable("id") Long id) throws TodoNotFoundException {
        model.addAttribute("todo", todoService.findById(id));
        return "edittodoform";
    }

    @PostMapping("/{id}/edit")
    public String updateTodo(@ModelAttribute("todoMod") Todo todo) throws TodoNotFoundException {
        todoService.save(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/view")
    public String viewTodoDetails(Model model, @PathVariable("id") Long id) throws TodoNotFoundException {
        model.addAttribute("todo", todoService.findById(id));
        return "tododetails";
    }

//    @PostMapping(value = "/{id}/edit")
//    public String editToDo(@ModelAttribute("todoMod") ToDo toDo) {
//        toDoService.save(toDo);
//        return "redirect:/todo";
//    }

    @ExceptionHandler(TodoNotFoundException.class)
    @ResponseBody
    public String todoNotFound() {
        return "Todo not found";
    }
}