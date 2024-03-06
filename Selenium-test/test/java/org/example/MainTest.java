package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void runSelenium() {
        assertEquals("Form submission result: Example Domain!", Main.performFormSubmission());
    }
}