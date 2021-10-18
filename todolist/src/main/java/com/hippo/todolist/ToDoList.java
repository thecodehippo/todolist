package com.hippo.todolist;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ToDoList {

    private final ArrayList<ToDoItem> toDoItemArrayList;

    public ToDoList(ArrayList<ToDoItem> toDoItemArrayList) {
        this.toDoItemArrayList = toDoItemArrayList;
    }

    public void addItem(ToDoItem toDoItem) {
        toDoItemArrayList.add(toDoItem);
    }

    public ArrayList<ToDoItem> getAllItems() {
        return toDoItemArrayList;
    }

    public int deleteItem(String task) {
        System.out.println(task);
        return toDoItemArrayList.indexOf(ToDoItem);
    }
}
