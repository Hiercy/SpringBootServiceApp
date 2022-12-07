package com.springboot.crud.controller;

import com.springboot.crud.dto.GreetingResponse;
import com.springboot.crud.service.interfaces.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GreetingController {

    private final GreetingService greetingService;

    @GetMapping("/")
    public ResponseEntity<GreetingResponse> greeting() {
        return ResponseEntity.ok(greetingService.greeting());
    }
}
