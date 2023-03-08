package com.marcioordonez.todolist.domain;

public class Task {
    private String title;
    private String description;
    private Boolean isActive;
    private TaskPriority priority;

    public Task(String title, String description, TaskPriority priority){
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isActive = true;
    }

    public Void deActivate() {
        this.isActive = false;

        return null;
    }

    public String getDescription() {
        return description;
    }
    public Boolean getIsActive() {
        return isActive;
    }
    public String getTitle() {
        return title;
    }
    public TaskPriority getPriority() {
        return priority;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
