package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;
import static com.levelup.forestsandmonsters.GameController.DIRECTION.*;

import java.awt.Point;

public class GameMap {
    static final int DEFAULT_POSITIONS = 100;
    static final Position DEFAULT_START_POSITION = new Position(0, 0);
    int numPositions;

    public GameMap() {
        this.numPositions = DEFAULT_POSITIONS;
    }

    public Position calculatePosition(Position startingPosition, DIRECTION direction) {
        Position newPosition = startingPosition;

        if (startingPosition == null) {
            newPosition = DEFAULT_START_POSITION;
        }

        if (direction == NORTH) {
            newPosition = new Position(newPosition.getX(), newPosition.getY() + 1);

        } else if (direction == SOUTH) {
            newPosition = new Position(newPosition.getX(), newPosition.getY() - 1);

        } else if (direction == EAST) {
            newPosition = new Position(newPosition.getX() + 1, newPosition.getY());

        } else if (direction == WEST) {
            newPosition = new Position(newPosition.getX() - 1, newPosition.getY());
        }

        if (isPositionValid(newPosition.coordinates) == true) {
            return newPosition;
        } else {
            return startingPosition;
        }

    }

    public boolean isPositionValid(Point p) {
        return p.getX() >= 0 && p.getX() <= 9 && p.getY() >= 0 && p.getY() <= 9;
    }

    public int getTotalPositions() {
        return numPositions;
    }

}
