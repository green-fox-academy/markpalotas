package com.example.todofromh2.Model;

public class ToDo {
    Long id;
    String title;
    Boolean urgent = false;
    Boolean done = false;

    public ToDo(Long id, String title, Boolean urgent, Boolean done) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

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
