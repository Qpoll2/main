package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSelenide() {
        assertEquals("Example Domain", Main.executeCustomSelenide());
    }
}