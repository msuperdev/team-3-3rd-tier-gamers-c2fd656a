package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Point;

import org.junit.Before;
import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMapTest {
    public GameMap testGameMap;

    @Before
    public void setup() {
        testGameMap = new GameMap();
    }

    @Test
    public void testGameMapCreate() {
        assertNotNull("Map should not be null", testGameMap);
        assertEquals("numPositions value after creation", 100, testGameMap.getTotalPositions());
    }

    @Test
    public void calculatePosition() {
        Position startPos00 = new Position(0, 0);
        Position result00N = testGameMap.calculatePosition(startPos00, DIRECTION.NORTH);
        assertEquals("0,0 U => 0,1", 0, result00N.getX());
        assertEquals("0,0 U => 0,1", 1, result00N.getY());
        Position result00E = testGameMap.calculatePosition(startPos00, DIRECTION.EAST);
        assertEquals("0,0 E => 1,0", 1, result00E.getX());
        assertEquals("0,0 E => 1,0", 0, result00E.getY());
        Position startPos89 = new Position(8, 9);
        Position result89E = testGameMap.calculatePosition(startPos89, DIRECTION.EAST);
        assertEquals("8,9 E => 9,9", 9, result89E.getX());
        assertEquals("8,9 E => 9,9", 9, result89E.getY());
        Position startPos01 = new Position(0, 1);
        Position result01E = testGameMap.calculatePosition(startPos01, DIRECTION.WEST);
        assertEquals("0,1 W => 1,9", 0, result01E.getX());
        assertEquals("0,1 W => 1,9", 1, result01E.getY());
    }

    @Test
    public void isPositionValid() {
        Point pos1 = new Point(0, 1);
        assertTrue("0,1", testGameMap.isPositionValid(pos1));
        Point pos2 = new Point(0, 10);
        assertFalse("0,10", testGameMap.isPositionValid(pos2));
        Point pos3 = new Point(10, 10);
        assertFalse("10,10", testGameMap.isPositionValid(pos3));
        Point pos4 = new Point(10, 0);
        assertFalse("10,0", testGameMap.isPositionValid(pos4));
    }

    @Test
    public void getTotalPositions() {
        assertEquals("Should have 100 positions", 100, testGameMap.getTotalPositions(),
                testGameMap.getTotalPositions() - 100);
    }
}
