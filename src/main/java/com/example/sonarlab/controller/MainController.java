package com.example.sonarlab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {
    @GetMapping()
    public ResponseEntity<String> getDefault() {
        return ResponseEntity.ok("Hello from expense record api");
    }

    @GetMapping("/wrong")
    public ResponseEntity<String> getwrong() {
        ResponseEntity reTurn = null;
        return reTurn;
    }
}
