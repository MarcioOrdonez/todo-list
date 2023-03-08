package com.marcioordonez.todolist.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BackLogTest {
    
    @Test
    public void shouldAddNewTasksToList(){
        BackLog tasks = new BackLog();
        Task taskOne = new Task(new String("title"), new String("description"), TaskPriority.High);

        tasks.addTask(taskOne);

        assertEquals(tasks.getTasks().get(0), taskOne);
    }
    
    @Test
    public void shouldRemoveTasksToList() {
        BackLog tasks = new BackLog();
        Task taskOne = new Task(new String("title"), new String("description"), TaskPriority.High);

        tasks.addTask(taskOne);

        assertEquals(tasks.getTasks().get(0), taskOne);

        tasks.removeTask(taskOne);

        assertTrue(!tasks.getTasks().contains(taskOne));
    }
}
