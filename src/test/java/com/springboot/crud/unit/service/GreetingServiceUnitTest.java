package com.springboot.crud.unit.service;

import com.springboot.crud.configuration.TestTags;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@Tag(TestTags.UNIT_TEST)
class GreetingServiceUnitTest {
    @Test
    void greeting() {
        int test = 1;
        assertEquals("Message", test, 1);
    }
}