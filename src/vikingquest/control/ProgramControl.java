/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.control;

import vikingquest.VikingQuest;
import vikingquest.model.Player;

/**
 *
 * @author Madeleine
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        if (playersName == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        VikingQuest.setPlayer(player);
        
        return player;
}
}
