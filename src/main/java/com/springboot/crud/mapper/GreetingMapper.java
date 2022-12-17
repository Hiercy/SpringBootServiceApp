package com.springboot.crud.mapper;

import com.springboot.crud.dto.GreetingRequest;
import com.springboot.crud.dto.GreetingResponse;
import com.springboot.crud.entity.Greeting;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GreetingMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "value", source = "value")
    Greeting greetingRequestToGreeting(GreetingRequest greetingRequest);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "value", source = "value")
    GreetingResponse toGreetingResponse(Greeting greeting);

    @IterableMapping(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
    List<GreetingResponse> toGreetingsResponse(List<Greeting> greetings);
}
