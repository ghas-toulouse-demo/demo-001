package com.example.hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * Test class for the HelloWorld
 */
public class HelloWorldTest {
    @Test
    public void testHello() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.hello());
    }
}
