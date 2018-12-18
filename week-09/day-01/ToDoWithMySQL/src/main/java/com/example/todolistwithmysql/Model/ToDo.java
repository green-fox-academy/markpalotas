package com.example.todolistwithmysql.Model;

import javax.persistence.*;

@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    Long id;
    String title;
    Boolean urgent = false;
    Boolean done = false;

    public ToDo() {
    }

    public ToDo(String title) {
        this.title = title;
    }

//    public ToDo(Long id, String title, Boolean urgent, Boolean done) {
//        this.id = id;
//        this.title = title;
//        this.urgent = urgent;
//        this.done = done;
//    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public Boolean getDone() {
        return done;
    }
}
