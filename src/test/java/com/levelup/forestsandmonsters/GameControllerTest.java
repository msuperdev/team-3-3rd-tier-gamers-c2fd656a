package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Point;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameControllerTest {
    private static final DIRECTION NORTH = null;

    //private static enum DIRECTION {
    //    NORTH, SOUTH, EAST, WEST
   // }

    

    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

   @Test
    public void CheckGameControllerStatusResults() {
        GameController testObj = new GameController();
        testObj.createCharacter("Purna");
        assertEquals("Purna",testObj.status.characterName);
    }

 @Test
    public void CheckstartGame() {
        GameController testObj = new GameController();
        testObj.startGame();
        //assertEquals(100, testObj.getTotalPositions(), 100 - testObj.getTotalPositions());
        System.out.println("Positions " + testObj.getTotalPositions());
              assertEquals("Should be 100", 100, testObj.getTotalPositions());
               assertNotEquals("Should be 100", 10, testObj.getTotalPositions());
//        assertNotNull(testObj.status);

    }

     @Test
    public void CheckSetCharacterPosition() {
        GameController testObj = new GameController();
        testObj.startGame();
       // testObj.setCharacterPosition(0,0);
     //  testObj.setCharacterPosition( new Point (0,0) );
     //  assertNotNull(testObj.status.currentPosition);
      //  testObj.setCharacterPosition(new Point (10,10) );
      boolean validPos;
      validPos =  testObj.gameMap.isPositionValid(new Point (0, 0) );
        assertTrue(validPos);
    }

}
