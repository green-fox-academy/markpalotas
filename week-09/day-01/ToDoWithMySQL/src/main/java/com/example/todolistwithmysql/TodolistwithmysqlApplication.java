package com.example.todolistwithmysql;

import com.example.todolistwithmysql.Model.ToDo;
import com.example.todolistwithmysql.Repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistwithmysqlApplication implements CommandLineRunner {

    ToDoRepo toDoRepo;

    @Autowired
    public TodolistwithmysqlApplication(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodolistwithmysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        toDoRepo.save(new ToDo("This is the first thing to do", true, false));
//        toDoRepo.save(new ToDo("This is the first thing already done", false, true));
    }
}

