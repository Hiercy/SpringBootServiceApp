package com.springboot.crud.dto;

import lombok.Data;

import java.math.BigInteger;

@Data
public class GreetingRequest {
    private BigInteger id;
    private String value;
}
