package com.marcioordonez.todolist.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaskTest {
    
    @Test
    public void shouldDeActivateTask(){
        Task sut = new Task(new String("task title"), new String("task description"), TaskPriority.High);

        assertEquals(sut.getIsActive(), true);

        sut.deActivate();
        
        assertEquals(sut.getIsActive(), false);
    }
}
