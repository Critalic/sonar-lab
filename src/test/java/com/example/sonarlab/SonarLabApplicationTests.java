package com.example.sonarlab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class SonarLabApplicationTests {

    @Test
    void contextLoads() {
        assertThat("sdf sd", equalTo("sdf sd"));
    }

}
