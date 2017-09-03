/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import becker.robots.*;
/**
 *
 * @author Usuario
 */
public class main {
    public static void main(String[] args) {
      City parqueadero = new City();
      Wall blockAve0 = new Wall(parqueadero, 0, 2, Direction.WEST);
      Wall blockAve1 = new Wall(parqueadero, 1, 2, Direction.WEST);
      Wall blockAve2 = new Wall(parqueadero, 2, 2, Direction.WEST);
      Wall blockAve3 = new Wall(parqueadero, 3, 2, Direction.WEST);
      Wall blockAve4 = new Wall(parqueadero, 4, 2, Direction.WEST);
      
      Wall blockAve5 = new Wall(parqueadero, 0, 4, Direction.WEST);
      Wall blockAve6 = new Wall(parqueadero, 1, 4, Direction.WEST);
      Wall blockAve7 = new Wall(parqueadero, 2, 4, Direction.WEST);
      Wall blockAve8 = new Wall(parqueadero, 3, 4, Direction.WEST);
      Wall blockAve9 = new Wall(parqueadero, 4, 4, Direction.WEST);
      
      Wall blockAve10 = new Wall(parqueadero, 0, 6, Direction.WEST);
      Wall blockAve11 = new Wall(parqueadero, 1, 6, Direction.WEST);
      Wall blockAve12 = new Wall(parqueadero, 2, 6, Direction.WEST);
      Wall blockAve13 = new Wall(parqueadero, 3, 6, Direction.WEST);
      Wall blockAve14= new Wall(parqueadero, 4, 6, Direction.WEST);
      
      Wall blockAve15 = new Wall(parqueadero, 4, 8, Direction.NORTH);
      Wall blockAve16 = new Wall(parqueadero, 4, 9, Direction.NORTH);
      Wall blockAve17 = new Wall(parqueadero, 4, 10, Direction.NORTH);
      Wall blockAve18 = new Wall(parqueadero, 4, 11, Direction.NORTH);
     
      
      
      
      Robot mark = new Robot(parqueadero, 0, 2, Direction.WEST);
      Robot ann = new Robot(parqueadero, 0, 1, Direction.EAST);


      // mark goes around the roadblock
      mark.turnLeft();
      mark.move();
      mark.move();
      mark.turnLeft();     // start turning right as three turn lefts
      mark.turnLeft();
      mark.turnLeft();     // finished turning right
      mark.move();

      // ann goes to meet mark
      ann.turnLeft();      // start turning right as three turn lefts
      ann.turnLeft();
      ann.turnLeft();      // finished turning right
     
      if(ann.frontIsClear())
          ann.move();
      
      ann.move();
      ann.turnLeft();

    }
}
