package com.example.todolistwithmysql;

import com.example.todolistwithmysql.Repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistwithmysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodolistwithmysqlApplication.class, args);
    }

    @Autowired
    private ToDoRepo toDoRepo;
}

