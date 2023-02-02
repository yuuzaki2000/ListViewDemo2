package com.example.listviewdemo2;

import java.time.LocalDate;

public class Task {
    private LocalDate date;
    private String task;

    public Task(LocalDate date,String task){
        this.date = date;
        this.task = task;
    }

    public LocalDate getDate(){
        return date;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }

    public String getTask(){
        return task;
    }
    public void setTask(){
        this.task = task;
    }

}
