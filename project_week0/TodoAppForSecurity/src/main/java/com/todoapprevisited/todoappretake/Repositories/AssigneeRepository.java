package com.todoapprevisited.todoappretake.Repositories;

import com.todoapprevisited.todoappretake.Model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
