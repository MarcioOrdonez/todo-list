package com.marcioordonez.todolist.handler.task;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doAnswer;

import org.mockito.Mockito;

import com.marcioordonez.todolist.domain.BackLog;
import com.marcioordonez.todolist.domain.Task;
import com.marcioordonez.todolist.domain.TaskPriority;
import com.marcioordonez.todolist.ports.TodoListMethods;

import net.bytebuddy.jar.asm.Handle;

public class CreateTaskHandlerTest {
    void shouldTestHandlerRepositoryCall(){
        BackLog tasks = new BackLog();
        Task taskOne = new Task(new String("title"), new String("description"), TaskPriority.High);

        tasks.addTask(taskOne);

        TodoListMethods repo = Mockito.mock(TodoListMethods.class);

        Mockito.when(repo.getBackLog()).thenReturn(tasks);


        CreateTaskHandler<TodoListMethods> handler = new CreateTaskHandler<TodoListMethods>(repo);

        BackLog backLog = handler.execute(taskOne);

        assertTrue(backLog.getTasks().contains(taskOne));
    }
}
