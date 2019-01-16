package com.example.todolistwithmysql.Services;

import com.example.todolistwithmysql.Model.ToDo;
import com.example.todolistwithmysql.Repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {

    ToDoRepo toDoRepo;

    @Autowired
    public ToDoService(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    public ToDo get(Long id) {
        Optional<ToDo> todo = toDoRepo.findById(id);
        if (todo.isPresent()) {
            return todo.get();
        }
        throw new IndexOutOfBoundsException();
    }

    public void save(ToDo todo) {
        toDoRepo.save(todo);
    }

//    public void update()

    public void delete(Long id) {
        toDoRepo.deleteById(id);
    }

    public List<ToDo> getAll() {
        return (List<ToDo>) toDoRepo.findAll();
    }

    public List<ToDo> findByUrgent(Boolean isUrgent) {
        return (List<ToDo>) toDoRepo.findAllByUrgent(isUrgent);
    }

    public List<ToDo> findByDone(Boolean isActive) {
        return (List<ToDo>) toDoRepo.findAllByDone(!isActive);
    }

    public List<ToDo> findByDoneAndUrgent(Boolean isActive, Boolean isUrgent) {
        return (List<ToDo>) toDoRepo.findAllByDoneAndUrgent(!isActive, isUrgent);
    }
}
