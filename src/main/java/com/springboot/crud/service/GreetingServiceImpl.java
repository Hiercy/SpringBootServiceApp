package com.springboot.crud.service;

import com.springboot.crud.dto.GreetingRequest;
import com.springboot.crud.dto.GreetingResponse;
import com.springboot.crud.entity.Greeting;
import com.springboot.crud.mapper.GreetingMapper;
import com.springboot.crud.repository.GreetingRepository;
import com.springboot.crud.service.interfaces.GreetingService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GreetingServiceImpl implements GreetingService {

    private final GreetingRepository greetingRepository;
    private final GreetingMapper greetingMapper;

    @Override
    public GreetingResponse hello() {
        return GreetingResponse.builder()
                .value("Hello!")
                .build();
    }

    @Override
    public List<GreetingResponse> getAllGreetings() {
        List<Greeting> greetings = greetingRepository.findAll();
        return greetingMapper.toGreetingsResponse(greetings);
    }

    @Override
    public GreetingResponse getGreetingById(BigInteger id) {
        Greeting greeting = greetingRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Cannot find greeting by id " + id));
        return greetingMapper.toGreetingResponse(greeting);
    }

    @Override
    public void saveGreeting(GreetingRequest greetingRequest) {
        Greeting greeting = greetingMapper.greetingRequestToGreeting(greetingRequest);
        greetingRepository.save(greeting);
    }

    @Override
    public void updateGreeting(GreetingRequest greetingRequest) {
        BigInteger id = greetingRequest.getId();
        Greeting greeting = greetingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cannot update greeting with id " + id + " not found"));
        Greeting newGreeting = greetingMapper.greetingRequestToGreeting(greetingRequest);
        if (StringUtils.isNotEmpty(greeting.getValue())) {
            greeting.setValue(newGreeting.getValue());
        }
        greetingRepository.save(greeting);
    }

    @Override
    public void removeGreeting(BigInteger id) {
        greetingRepository.deleteById(id);
    }
}
