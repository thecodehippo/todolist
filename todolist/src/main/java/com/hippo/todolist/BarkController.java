package com.hippo.todolist;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dog")
@RequiredArgsConstructor
public class BarkController {

    private final Dog dog;

    @GetMapping("/bark")
    public ResponseEntity createTransaction() {
        dog.speak();
        return ResponseEntity.ok("Spoken");
    }
}
