package com.example.todofromh2;

import com.example.todofromh2.Model.ToDo;
import com.example.todofromh2.Repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todofromh2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Todofromh2Application.class, args);
    }

    @Autowired
    private ToDoRepo toDoRepo;


    @Override
    public void run(String... args) throws Exception {
        toDoRepo.save(new ToDo("gotta practice this thing"));
        toDoRepo.save(new ToDo("and then practice some more"));
        toDoRepo.save(new ToDo("and then even more"));
    }
}

