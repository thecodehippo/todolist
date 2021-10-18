package com.hippo.todolist;

import lombok.Data;

@Data
public class ToDoItem {

    private String task;
    private boolean complete;

    public ToDoItem(String task, boolean complete) {
        this.task = task;
        this.complete = complete;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "task='" + task + '\'' +
                ", complete=" + complete +
                '}';
    }
}
