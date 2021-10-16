package com.hippo.todolist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CreateTableRequest {
    private String tableName;
    private String key;
}
