package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GameMapTest {
    public GameMap testGameMap;

    @Test
    public void testGameMapCreate() {
        testGameMap = new GameMap();
        assertNotNull("Map should not be null", testGameMap);
        assertEquals("numPositions value after creation", 100, testGameMap.getPositions());
    }
}
