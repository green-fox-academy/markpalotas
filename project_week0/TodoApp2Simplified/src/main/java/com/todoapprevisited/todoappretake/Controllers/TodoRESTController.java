package com.todoapprevisited.todoappretake.Controllers;

import com.todoapprevisited.todoappretake.Model.Todo;
import com.todoapprevisited.todoappretake.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo/api")
public class TodoRESTController {

    TodoService todoService;

    @Autowired
    public TodoRESTController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping(value = "/add")
    public String addTodo(@RequestBody Todo todo) {
        todoService.save(todo);
        return "redirect:/todo";
    }

    @GetMapping(value = {"", "/list"})
    public ResponseEntity<List<Todo>> listTodo() {
        return new ResponseEntity<>(todoService.getAll(), HttpStatus.OK);
    }
}
