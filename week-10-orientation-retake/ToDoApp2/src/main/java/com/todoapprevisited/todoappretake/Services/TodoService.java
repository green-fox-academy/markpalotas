package com.todoapprevisited.todoappretake.Services;

import com.todoapprevisited.todoappretake.Model.Todo;
import com.todoapprevisited.todoappretake.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAll() {
        return (List<Todo>) todoRepository.findAll();
    }

    public List<Todo> getByActive(Boolean isActive) {
        return (List<Todo>) todoRepository.findAllByDone(!isActive);
    }

    public void save(Todo todo) {
        todoRepository.save(todo);
    }
}
