package com.springboot.crud.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GreetingResponse {
    private String value;
}
