package com.levelup.forestsandmonsters;

import java.awt.Point;

public class Position {
    Point coordinates;

    public Position(int xCoordinates, int yCoordinates) {
        this.coordinates = new Point(xCoordinates, yCoordinates);
    }

    public int getX() {
        return coordinates.x;
    }
    public int getY() {
        return coordinates.y;
    }
}
