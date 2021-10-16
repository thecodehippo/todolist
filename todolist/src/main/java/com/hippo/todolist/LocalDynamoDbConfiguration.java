package com.hippo.todolist;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalDynamoDbConfiguration {

    @Bean
    DynamoDB dynamoDB() {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "EU_WEST_1"))
                .build();

        DynamoDB dynamoDB = new DynamoDB(client);
        return dynamoDB;
    }

    @Bean
    Dog dog() {
        return new Dog();
    }

}

