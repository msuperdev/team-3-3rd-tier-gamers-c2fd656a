package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";

    public class GameStatus {
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;
        public int moveCount = 0;

        public String toString() {
            return "Character Name: " + characterName +
                    "\nStarting Position: (" + GameMap.DEFAULT_START_POSITION.getX() + ","
                    + GameMap.DEFAULT_START_POSITION.getY() + ")" +
                    "\nCurrent Position: (" + currentPosition.x + "," + currentPosition.y + ")" +
                    "\nMove count " + moveCount;
        }
    }

    GameStatus status;
    GameMap gameMap = new GameMap();
    Character character = new Character();

    public GameController() {
        status = new GameStatus();
    }

    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    public void createCharacter(String name) {
        if (name != null && !name.equals("")) {
            status.characterName = name;
        } else {
            status.characterName = DEFAULT_CHARACTER_NAME;
        }
        this.character = new Character(name);
    }

    public void startGame() {
        this.gameMap = new GameMap();
        this.setCharacterPosition(GameMap.DEFAULT_START_POSITION.coordinates);
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        character.move(directionToMove);
        status.moveCount++;
        status.currentPosition = character.getPosition().coordinates;
        System.out.println(status);
    }

    public void setCharacterPosition(Point coordinates) {
        status.currentPosition = coordinates;
        character.enterMap(gameMap);
        character.position = gameMap.calculatePosition(new Position(coordinates.x, coordinates.y), null);
    }

    public void setCurrentMoveCount(int moveCount) {
        status.moveCount = moveCount;
    }

    public int getTotalPositions() {
        return this.gameMap.getTotalPositions();
    }

}
