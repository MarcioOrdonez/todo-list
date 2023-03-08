package com.marcioordonez.todolist.handler.task;

import com.marcioordonez.todolist.domain.BackLog;
import com.marcioordonez.todolist.domain.Task;
import com.marcioordonez.todolist.handler.Handler;
import com.marcioordonez.todolist.ports.TodoListMethods;

public class CreateTaskHandler<R extends TodoListMethods> implements Handler<BackLog, Task>{
    private R repository;

    public CreateTaskHandler(R repository){
        this.repository = repository;
    }

    @Override
    public BackLog execute(Task request) {
        BackLog backLog = this.repository.getBackLog(); 

        backLog.addTask(request);

        this.repository.save(backLog);
        
        return backLog;
    }
}
