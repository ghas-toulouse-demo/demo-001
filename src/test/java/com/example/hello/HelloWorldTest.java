package com.example.hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    @Test
    public void testHello() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.hello());
    }

    @Test
    public void testGoodbye(){
        HelloWorld hw = new HelloWorld();
        assertEquals("Goodbye, World!", hw.goodbye());
    }
}
