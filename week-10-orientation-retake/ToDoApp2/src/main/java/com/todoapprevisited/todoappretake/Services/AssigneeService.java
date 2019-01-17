package com.todoapprevisited.todoappretake.Services;

import com.todoapprevisited.todoappretake.Exceptions.AssigneeNotFoundException;
import com.todoapprevisited.todoappretake.Model.Assignee;
import com.todoapprevisited.todoappretake.Repositories.AssigneeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void delete(Assignee assignee) {
        assigneeRepository.delete(assignee);
    }

    public Assignee findById(Long id) throws AssigneeNotFoundException {
        Optional<Assignee> assignee = assigneeRepository.findById(id);
        if (assignee.isPresent()) {
            return assignee.get();
        }
        throw new AssigneeNotFoundException();
    }

}
