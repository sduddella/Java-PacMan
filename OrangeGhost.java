//mahiyah muthu
//4.25.21

//orange ghost 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/********************************
* this the file for the orange ghost 
********************************/
public class OrangeGhost extends GhostDriver 
{

   /*****************************************************
   * creates a new file for the orange ghost
   * @param startX  
   *  intial start x distance 
   * @param startY  
   *  intial start y distance
   ******************************************************/
   
   public OrangeGhost(double startX, double startY)
   {
      super(startX, startY);
      
      //retrieve orange ghost right image from file directory
      image = new ImageIcon(getClass().getResource("img/" +"OrangeRight.png"));

      //set a new timer to enable the ghosts to start 20 seconds after pac man launches
      timer = new Timer(20, new ActionListener()
      {
         public void actionPerformed(ActionEvent a)
         {
            
            if (a.getSource() == timer)
            {
					move();
            }
         }
      });

      //parameters for timer is action event (method used will allow ghost to sync with timer)
      timer.start(); //starts the timer
      
   }
   
   
}