package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import java.awt.Point;
import org.junit.Test;

public class GameControllerTest {

    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void createCharacter() {
        GameController testObj = new GameController();
        testObj.createCharacter("Purna");
        assertEquals("Purna", testObj.status.characterName);
    }

    @Test
    public void startGame() {
        GameController testObj = new GameController();
        testObj.startGame();
        assertEquals("Should be 100", 100, testObj.getTotalPositions());
        assertNotEquals("Should be 100", 10, testObj.getTotalPositions());
    }

    @Test
    public void setCharacterPosition() {
        GameController testObj = new GameController();
        Point point = new Point(5, 5);
        testObj.setCharacterPosition(point);
        assertNotNull("Valid Status", testObj.status);
        assertNotNull("Valid Position", testObj.status.currentPosition);
        assertEquals("Wrong Status current position", new Point(5, 5), testObj.status.currentPosition);
    }

}
