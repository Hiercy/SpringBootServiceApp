package com.springboot.crud.repository;

import com.springboot.crud.entity.Greeting;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface GreetingRepository extends MongoRepository<Greeting, BigInteger> {
}
