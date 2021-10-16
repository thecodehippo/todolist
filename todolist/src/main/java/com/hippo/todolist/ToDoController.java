package com.hippo.todolist;

import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.model.*;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/todo")
@RequiredArgsConstructor
public class ToDoController {

    private final DynamoDB dynamoDB;

    @GetMapping(value = "/getTableNames")
    public ArrayList<String> getAllTables() {
        ArrayList<String> tableList = new ArrayList<>();
        dynamoDB.listTables().forEach(e -> tableList.add(e.getTableName()));
        return tableList;
    }

    @PostMapping(value = "/createTable", consumes = "application/json", produces = "application/json")
    public void createTable(@RequestBody CreateTableRequest createTableRequest) {
        System.out.println(createTableRequest.getTableName());
        System.out.println(createTableRequest.getKey());
        dynamoDB.createTable(createTableRequest.getTableName(),
                List.of(new KeySchemaElement(createTableRequest.getKey(), KeyType.HASH)),
                List.of(new AttributeDefinition(createTableRequest.getKey(), ScalarAttributeType.S)),
                new ProvisionedThroughput(10L, 10L));
    }

}
