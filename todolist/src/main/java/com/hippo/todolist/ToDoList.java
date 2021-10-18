package com.hippo.todolist;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    public String deleteItem(String task) {
        List<ToDoItem> result = toDoItemArrayList.stream().filter(e -> e.getTask().equalsIgnoreCase(task)).collect(Collectors.toList());
        result.forEach(r -> toDoItemArrayList.remove(r));
        return "done";
    }
}
