package com.sapient;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testingForName() {
        String expectedName = "Harish";
        String actualName = "Harish";

        assertEquals(expectedName, actualName);
    }

    public void testAdd() {
        assertEquals(30, App.addNumber(10, 20));
    }

}
