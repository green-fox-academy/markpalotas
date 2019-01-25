package com.todoapprevisited.todoappretake.Controllers;

import com.todoapprevisited.todoappretake.Exceptions.TokenIncorrectException;
import com.todoapprevisited.todoappretake.Exceptions.TokenMissingException;
import com.todoapprevisited.todoappretake.Model.Todo;
import com.todoapprevisited.todoappretake.Services.AssigneeService;
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
    AssigneeService assigneeService;

    @Autowired
    public TodoRESTController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @PostMapping(value = "/add")
    public String addTodo(@RequestBody Todo todo) throws TokenIncorrectException, TokenMissingException {
        todoService.save(todo);
        return "redirect:/todo";
    }

    @GetMapping(value = {"", "/list"})
    public ResponseEntity<List<Todo>> listTodo() throws TokenIncorrectException, TokenMissingException {
        return new ResponseEntity<>(todoService.getAll(), HttpStatus.OK);
    }

//    @ResponseStatus(value=HttpStatus.UNAUTHORIZED, reason="Unauthorized")
    @ExceptionHandler(TokenIncorrectException.class)
    public void conflict1() {
    }

//    @ResponseStatus(value=HttpStatus.UNAUTHORIZED, reason="Unauthorized")
    @ExceptionHandler(TokenMissingException.class)
    public void conflict2() {
    }
}
