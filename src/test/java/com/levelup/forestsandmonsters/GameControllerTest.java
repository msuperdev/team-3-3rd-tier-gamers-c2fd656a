package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class GameControllerTest {
    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

   @Test
    public void CreatesCharacterResults() {
        GameController testObj = new GameController();
        testObj.createCharacter("Purna");
        assertNotNull(testObj.status);
    }

}
