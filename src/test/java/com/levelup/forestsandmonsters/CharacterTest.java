package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import com.levelup.forestsandmonsters.Character;
//import com.levelup.forestsandmonsters.GameController.DIRECTION;

import org.junit.Test;

public class CharacterTest {

    String characterName;
  @Test
    public void getname() {

        Character chars=new Character();
       chars.getname();
        assertEquals("Character", chars.getname());
       
       //this.characterName = characterName
    }
 public void startingposition(){
 Character chars=new Character();
 chars.getPosition();
 
 }
public void aftermove(){
 Character chars=new Character();

 chars.move(null);
}
}
