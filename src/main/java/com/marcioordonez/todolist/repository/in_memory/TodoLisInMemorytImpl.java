package com.marcioordonez.todolist.repository.in_memory;

import com.marcioordonez.todolist.domain.BackLog;

import com.marcioordonez.todolist.ports.TodoListMethods;

public class TodoLisInMemorytImpl implements TodoListMethods {
    private BackLog backLog;


    public TodoLisInMemorytImpl(){
        this.backLog = new BackLog();
    }

    @Override
    public BackLog getBackLog() {

        return this.backLog;
    }

    @Override
    public void save(BackLog backLog) {
       this.backLog = backLog;
    }

}
