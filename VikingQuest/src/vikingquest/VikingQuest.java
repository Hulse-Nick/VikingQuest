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
import vikingquest.model.Actor;


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
        Location locationOne=new Location();
        
        locationOne.setxCoord(1.0);
        locationOne.setyCoord(1.0);
        String playerLocation = locationOne.toString();
        System.out.println(playerLocation);
           /**
 * The following function call sets the player's scene description
 * and if it is currently passable.
 * @author Nicholas
 */     
        Scene sceneOne=new Scene();
        
        sceneOne.setDescription("You arrive on a beach");
        sceneOne.setBlocked(false);
        
        String playerScene = sceneOne.toString();
        System.out.println(playerScene);
        
          /**
 * The following function call sets the player's current obstacle
 * and describes its weakness.
 * @author Nicholas
 */      
        Obstacle obstacleOne=new Obstacle();
        
        obstacleOne.setObstacleType("You see a pile of wood");
        obstacleOne.setWeakness("Wood is flamable");
        
        String playerObstacle = obstacleOne.toString();
        System.out.println(playerObstacle);
   /**
 *  The following call sets the player's Ship information.
 * 
 * @author Nicholas
 */
        Ship shipOne=new Ship();
        
        shipOne.setTitle("Jolly Roger");
        shipOne.setHealth(100);
        
        String playerShip = shipOne.toString();
        System.out.println(playerShip);
        
        
        Actor actorOne=new Actor();
        
        actorOne.setName("Larry");
        String actorLarry = actorOne.toString();
        System.out.println(actorLarry);
    }
}
