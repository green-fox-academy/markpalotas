package com.example.todolistwithmysql.Repositories;

import com.example.todolistwithmysql.Model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepo extends CrudRepository<ToDo, Long> {
}
