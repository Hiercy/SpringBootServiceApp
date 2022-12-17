package com.springboot.crud.service.interfaces;

import com.springboot.crud.dto.GreetingRequest;
import com.springboot.crud.dto.GreetingResponse;

import java.math.BigInteger;
import java.util.List;

public interface GreetingService {
    GreetingResponse hello();

    List<GreetingResponse> getAllGreetings();

    GreetingResponse getGreetingById(BigInteger id);

    void saveGreeting(GreetingRequest greetingRequest);

    void updateGreeting(GreetingRequest greetingRequest);

    void removeGreeting(BigInteger id);
}
