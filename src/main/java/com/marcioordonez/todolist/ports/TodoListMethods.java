package com.marcioordonez.todolist.ports;

import com.marcioordonez.todolist.domain.BackLog;

public interface TodoListMethods {
    public void save(BackLog backLog);

    public BackLog getBackLog();
}
