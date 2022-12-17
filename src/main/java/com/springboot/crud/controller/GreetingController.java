package com.springboot.crud.controller;

import com.springboot.crud.dto.GreetingRequest;
import com.springboot.crud.dto.GreetingResponse;
import com.springboot.crud.service.interfaces.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping(value = "/greetings")
@RequiredArgsConstructor
public class GreetingController {

    private final GreetingService greetingService;

    @GetMapping("/hello")
    public ResponseEntity<GreetingResponse> greeting() {
        return ResponseEntity.ok(greetingService.hello());
    }

    @GetMapping("/")
    public ResponseEntity<List<GreetingResponse>> getGreetings() {
        return ResponseEntity.ok(greetingService.getAllGreetings());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GreetingResponse> getGreetingById(@PathVariable("id") BigInteger id) {
        return ResponseEntity.ok(greetingService.getGreetingById(id));
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public void saveGreeting(@RequestBody GreetingRequest greetingRequest) {
        greetingService.saveGreeting(greetingRequest);
    }

    @PutMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public void updateGreeting(@RequestBody GreetingRequest greetingRequest) {
        if (greetingRequest == null || greetingRequest.getId() == null) {
            throw new RuntimeException("Id cannot be null");
        }
        greetingService.updateGreeting(greetingRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void removeGreeting(@PathVariable("id") BigInteger id) {
        greetingService.removeGreeting(id);
    }
}
