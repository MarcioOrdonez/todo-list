package com.marcioordonez.todolist.domain;

import java.util.ArrayList;

public class BackLog {
    private ArrayList<Task> tasks;

    public BackLog(){
        this.tasks = new ArrayList<Task>();
    }
    
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task){
        this.tasks.add(task);
    }

    public void removeTask(Task task){
        this.tasks.remove(task);
    }
}
