//Demi Tudorache 
//04.25.21

import java.util.Random;

public class GhostDriver extends Character
{

   /*****************************************************
   * creates a new file for the MAIN ghost driver file
   * startProcess var will control the start of the ghost behavior
   * @param 
   *   startX  intial start x distanc 
   * @param 
   *   startY  intial start y distance
   ******************************************************/
   public GhostDriver(double startX, double startY)
   {
      super(startX, startY);
      //set startProcess to false (maybe block also)
      
   }
   
   /**method to move the pacman, but if it is eating, restart board*/
   public void move()
   {
      Random.move();
      //if pac man is eaten, restart board and set startProcess to false
   
   repaint();
   }
   
   /**method for ghosts to eat pacman*/
   private boolean eatPacMan(){}
   
   
   /*****************************************************
   * method for setting the direction for ghosts
   * @param 
   *   aX   
   * @param 
   *   aY
   * @param
   *   bX
   * @param
   *   bY  
   ******************************************************/
   private void setDirection(int aX, int aY, int bX, int bY)
   {
      //based on int values...
         //turn left
         //turn right  
         //turn up 
         //turn down     
   }
   
  
   /**method for setting values and movement*/
   private void randomMove()
   {
      //set values from turn methods to correct x and y coordinates in game board
      //MAKE SURE TO return values
   }
   
   /**method for timer to stop*/
   public void stopTimer(){}
   
}
  