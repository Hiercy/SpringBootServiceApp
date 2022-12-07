package com.springboot.crud.service;

import com.springboot.crud.dto.GreetingResponse;
import com.springboot.crud.service.interfaces.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public GreetingResponse greeting() {
        return GreetingResponse.builder()
                .value("Hello!")
                .build();
    }
}
