package com.hippo.todolist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ToDo {
    private String id;
    private String task;
    private String completed;

}
