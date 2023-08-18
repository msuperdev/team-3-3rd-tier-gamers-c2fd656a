package com.levelup.forestsandmonsters;

import java.awt.Point;

import javax.print.attribute.standard.PagesPerMinute;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";

    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;
        // number
        public int moveCount = 0;
    }

    GameStatus status;
    GameMap gameMap = new GameMap();
    Character character = new Character();

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        if (name != null && !name.equals("")) {
            status.characterName = name;
        } else {
            status.characterName = DEFAULT_CHARACTER_NAME;
        }
        this.character = new Character(name);
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the
        // character
        // on them?
        this.gameMap = new GameMap();
        this.setCharacterPosition(new Point(0, 0));
        // Position curposition = new Position(0,0);
        // TODO: Should also update the game results?
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
        character.move(directionToMove);
        status.moveCount++;
        status.currentPosition = character.getPosition().coordinates;
    }

    public void setCharacterPosition(Point coordinates) {
        // TODO: IMPLEMENT THIS TO SET CHARACTERS CURRENT POSITION -- exists to be
        // testable
        // Boolean validPosition = this.gameMap.isPositionValid(new coordinates);
        // this.gameMap = character.;
        status.currentPosition = coordinates;
        //gameMap.calculatePosition(new Position(coordinates.x, coordinates.y), null);
        character.enterMap(gameMap);
        character.position = gameMap.calculatePosition(new Position(coordinates.x, coordinates.y), null);
    }

    public void setCurrentMoveCount(int moveCount) {
        // TODO: IMPLEMENT THIS TO SET CURRENT MOVE COUNT -- exists to be testable
        status.moveCount = moveCount;
    }

    public int getTotalPositions() {
        // TODO: IMPLEMENT THIS TO GET THE TOTAL POSITIONS FROM THE MAP -- exists to be
        // testable
        return this.gameMap.getTotalPositions();
    }

}
