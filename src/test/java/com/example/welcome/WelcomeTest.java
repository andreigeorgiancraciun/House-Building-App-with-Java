package com.example.welcome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WelcomeTest {
    @Test
    void testHelloWorld() {
        assertEquals("Hello world!", Welcome.getHelloWorld());
    }
}
