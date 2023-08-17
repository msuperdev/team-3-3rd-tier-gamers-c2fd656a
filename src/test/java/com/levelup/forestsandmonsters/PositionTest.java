package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PositionTest {
    public Position testObj;

    @Test
    public void testCreate() {
        int x = 0;
        int y = 0;
        testObj = new Position(x, y);
        assertNotNull("Position should not be nulll", testObj);
        assertEquals("X value after creation", x, testObj.getX());
        assertEquals("Y value after creation", y, testObj.getY());
    }
}
