package com.levelup.forestsandmonsters;

public class Character {

  static final String DEFAULT_NAME = "Character";
  String name;
  Position position;

  public Character(String name) {
    this.name = name;
  }

  public Character() {
    this.name = DEFAULT_NAME;
  }

  public String getname() {
    return name;
  }

  public void enterMap(GameMap map) {

  }

  public Position getPosition() {
    return position;
  }

}
