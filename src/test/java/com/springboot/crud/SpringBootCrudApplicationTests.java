package com.springboot.crud;

import com.springboot.crud.configuration.TestTags;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Tag(TestTags.INTEGRATION_TEST)
@SpringBootTest
class SpringBootCrudApplicationTests {
    @Test
    void contextLoads() {
    }
}
