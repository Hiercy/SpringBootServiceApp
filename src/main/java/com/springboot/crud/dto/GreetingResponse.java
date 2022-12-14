package com.springboot.crud.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigInteger;

@Data
@Builder
public class GreetingResponse {
    private BigInteger id;
    private String value;
}
