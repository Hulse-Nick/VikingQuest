/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
package vikingquest;
 
import vikingquest.model.Location;
import vikingquest.model.Obstacle;
import vikingquest.model.Player;
import vikingquest.model.Scene;
import vikingquest.model.Ship;


/**
 *
 * @author Madeleine
 */
public class VikingQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne=new Player();
        
        playerOne.setCostume("horned helmet");
        playerOne.setBackpack("empty");
        playerOne.setScore(87.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        /**
 * The following function call sets the player's current location.
 * @author Nicholas
 */
        Location LocationOne=new Location();
        
        LocationOne.setxCoord(1.0);
        LocationOne.setyCoord(1.0);
        String playerLocation = LocationOne.toString();
        System.out.println(playerLocation);
           /**
 * The following function call sets the player's scene description
 * and if it is currently passable.
 * @author Nicholas
 */     
        Scene SceneOne=new Scene();
        
        SceneOne.setDescription("You arrive on a beach");
        SceneOne.setBlocked(false);
        
        String playerScene = SceneOne.toString();
        System.out.println(playerScene);
        
          /**
 * The following function call sets the player's current obstacle
 * and describes its weakness.
 * @author Nicholas
 */      
        Obstacle ObstacleOne=new Obstacle();
        
        ObstacleOne.setObstacleType("You see a pile of wood");
        ObstacleOne.setWeakness("Wood is flamable");
        
        String playerObstacle = ObstacleOne.toString();
        System.out.println(playerObstacle);
   /**
 *  The following call sets the player's Ship information.
 * 
 * @author Nicholas
 */
        Ship ShipOne=new Ship();
        
        ShipOne.setTitle("Jolly Roger");
        ShipOne.setHealth(100);
        
        String playerShip = ShipOne.toString();
        System.out.println(playerShip);
        
    }
}
