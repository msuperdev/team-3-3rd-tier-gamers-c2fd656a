package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {

  static final String DEFAULT_NAME = "Character";
  String name;
  Position position;
  GameMap map;

  public Character(String name) {
    this.name = name;
  }

  public Character() {
    this.name = DEFAULT_NAME;
  }

  public String getname() {
    return name;
  }


  public void enterMap(GameMap map123) {
    this.map = new GameMap();
    this.position = map.calculatePosition(null, null);
  }

  public Position getPosition() {
    return position;
  }

  public void move(DIRECTION direction) {
    Position cPos = getPosition();
    Position newPos = map.calculatePosition(cPos, direction);
    this.position = newPos;
  }
}
