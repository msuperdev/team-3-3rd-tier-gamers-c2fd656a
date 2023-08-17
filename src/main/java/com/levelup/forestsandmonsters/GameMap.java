package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;
import static com.levelup.forestsandmonsters.GameController.DIRECTION.*;

public class GameMap {
    static final int DEFAULT_POSITIONS = 100;
    int numPositions;

    public GameMap() {
        this.numPositions = DEFAULT_POSITIONS;
    }

    public Position calculatePosition(Position startingPosition, DIRECTION direction) {
        Position newPosition = new Position(startingPosition.getX(), startingPosition.getY());

        if (direction == NORTH) {
            newPosition.y++;

        } else if (direction == SOUTH) {
            newPosition.y--;

        } else if (direction == EAST) {
            newPosition.x++;

        } else if (direction == WEST) {
            newPosition.x--;
        }

        if (isPositionValid(newPosition) == true) {
            return newPosition;
        } else
            return startingPosition;

    }

    public boolean isPositionValid(Position p) {
        return p.getX() >= 0 && p.getX() <= 9 && p.getY() >= 0 && p.getY() <= 9;
    }

    public int getTotalPositions() {
        return numPositions;
    }

}
