package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMap {
    int numPositions;

    public GameMap (){
        this.numPositions = 100;
    }

    public int getPositions(){
        return numPositions;
    }

    public Position calculatePosition(Position startingPosition, DIRECTION direction){
        return startingPosition;
    }

    public boolean isPositionValid(Position p){
        return true;
    }

    public int getTotalPositions(){
        return 1;
    }

}
