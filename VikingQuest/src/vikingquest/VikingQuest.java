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
 
import vikingquest.model.Player;


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
    }
}
