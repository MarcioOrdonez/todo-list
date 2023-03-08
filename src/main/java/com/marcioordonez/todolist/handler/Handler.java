package com.marcioordonez.todolist.handler;

public interface Handler<T,R> {
    public T execute(R request);
}
