package com.example.todofromh2.Repositories;

import com.example.todofromh2.Model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepo extends CrudRepository<ToDo, Long> {
}
