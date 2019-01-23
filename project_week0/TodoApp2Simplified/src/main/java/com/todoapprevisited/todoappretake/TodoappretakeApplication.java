package com.todoapprevisited.todoappretake;

import com.todoapprevisited.todoappretake.Model.Todo;
import com.todoapprevisited.todoappretake.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappretakeApplication implements CommandLineRunner {

    TodoRepository todoRepository;

    @Autowired
    public TodoappretakeApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoappretakeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        todoRepository.save(new Todo("First", false, false));
//        todoRepository.save(new Todo("Sec", true, false));
//        todoRepository.save(new Todo("Third", false, true));
//        todoRepository.save(new Todo("Fourth", true, true));
//        todoRepository.save(new Todo("Fifth", false, false));
//        assigneeRepository.save(new Assignee("john@doe.com", "John Doe"));
//        assigneeRepository.save(new Assignee("jane@doe.com", "Jane Doe"));

    }
}

