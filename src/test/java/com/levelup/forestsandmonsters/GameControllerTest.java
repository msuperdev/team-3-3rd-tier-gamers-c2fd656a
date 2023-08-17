package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
       // assertEquals(100, testObj.getTotalPositions());
//        assertNotNull(testObj.status);

    }

}
