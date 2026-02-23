package com.java21.testapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

    @GetMapping
    public ResponseEntity<?> github() {
        return ResponseEntity.ok("CI/CD via Github");
    }
}
