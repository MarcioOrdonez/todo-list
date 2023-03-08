package com.marcioordonez.todolist;

import com.marcioordonez.todolist.domain.BackLog;
import com.marcioordonez.todolist.domain.Task;
import com.marcioordonez.todolist.domain.TaskPriority;
import com.marcioordonez.todolist.handler.task.CreateTaskHandler;
import com.marcioordonez.todolist.repository.in_memory.TodoLisInMemorytImpl;

public class TodoList {
    public static void main(String[] args) {
        TodoLisInMemorytImpl repo = new TodoLisInMemorytImpl();

        CreateTaskHandler<TodoLisInMemorytImpl> handler = new CreateTaskHandler<TodoLisInMemorytImpl>(repo);

        Task task = new Task(new String("titulo"), new String("descricao"), TaskPriority.High);

        BackLog result = handler.execute(task);

        System.out.println(result.getTasks().get(0).getTitle());
    }
}
