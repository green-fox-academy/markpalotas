package com.example.todolistwithmysql.Repositories;

import com.example.todolistwithmysql.Model.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepo extends CrudRepository<ToDo, Long> {
    List<ToDo> findAllByDone(Boolean isActive);

    List<ToDo> findAllByUrgent(Boolean isUrgent);

    List<ToDo> findAllByDoneAndUrgent(Boolean isActive, Boolean isUrgent);
}
