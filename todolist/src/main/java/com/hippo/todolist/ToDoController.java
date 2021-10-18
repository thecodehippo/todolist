package com.hippo.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
//@RequestMapping(path = "/todo")
public class ToDoController {

    @Autowired
    private ToDoList toDoList;

    @GetMapping
    public Healthcheck healthcheck() {
        return new Healthcheck("ok");
    }

    @GetMapping(value = "/getAllItems")
    public ArrayList<ToDoItem> getAllItems() {
        return toDoList.getAllItems();
    }

    @PostMapping(value = "/addItem")
    public void addItem(@RequestBody ToDoItem toDoItem) {
        toDoList.addItem(toDoItem);
    }

    @PostMapping(value = "/deleteItem")
    public String deleteItem(@RequestParam String task) {
        return toDoList.deleteItem(task.toString());
    }


}
