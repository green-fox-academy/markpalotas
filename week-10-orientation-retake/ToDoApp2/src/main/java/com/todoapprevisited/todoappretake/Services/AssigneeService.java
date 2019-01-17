package com.todoapprevisited.todoappretake.Services;

import com.todoapprevisited.todoappretake.Model.Assignee;
import com.todoapprevisited.todoappretake.Repositories.AssigneeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeService {

    AssigneeRepository assigneeRepository;

    public AssigneeService(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public List<Assignee> getAll() {
        return (List<Assignee>) assigneeRepository.findAll();
    }

    public void save(Assignee assignee) {
        assigneeRepository.save(assignee);
    }
}
