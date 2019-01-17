package com.todoapprevisited.todoappretake.Repositories;

import com.todoapprevisited.todoappretake.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {

    Iterable<Todo> findAllByDone(Boolean isDone);
}
