package com.springboot.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document
@Getter
@Setter
@AllArgsConstructor
public class Greeting {
    @Id
    private BigInteger id;
    private String value;
}
