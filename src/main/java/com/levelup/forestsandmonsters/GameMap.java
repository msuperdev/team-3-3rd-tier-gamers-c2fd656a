package com.levelup.forestsandmonsters;

public class GameMap {
    int numPositions;

    public GameMap (){
        this.numPositions = 100;
    }

    public int getPositions(){
        return numPositions;
    }

    public Position calculatePosition(Position startingPosition, String direction){
        return startingPosition;
    }

    public boolean isPositionValid(Position p){
        return true;
    }

    public int getTotalPositions(){
        return 1;
    }

}
