package com.todoapprevisited.todoappretake.Services;

import com.todoapprevisited.todoappretake.Exceptions.TodoNotFoundException;
import com.todoapprevisited.todoappretake.Model.Todo;
import com.todoapprevisited.todoappretake.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    public void save(Todo todo) throws TodoNotFoundException {
        todo.setCreateDate(findById(todo.getId()).getCreateDate());
        todo.setModifyDate(new Date());
        todoRepository.save(todo);
    }

    public void delete(Todo todo) {
        todoRepository.delete(todo);
    }

    public Todo findById(Long id) throws TodoNotFoundException {
        Optional<Todo> todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            return todo.get();
        }
        throw new TodoNotFoundException();
    }
}
