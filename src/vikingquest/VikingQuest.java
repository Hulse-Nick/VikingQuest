package vikingquest;
 
import vikingquest.model.Game;
import vikingquest.model.Player;
import vikingquest.view.StartProgram;

/*import vikingquest.model.Location;
import vikingquest.model.Obstacle;
import vikingquest.model.Scene;
import vikingquest.model.Ship;
import vikingquest.model.Actor;
import vikingquest.model.Map;
import vikingquest.model.NPC;
import vikingquest.model.Item;


import vikingquest.control.CombatControl;
import vikingquest.control.BridgeControl;
import vikingquest.control.QuickSandControl;
/**
 *
 * @author Madeleine
 */
public class VikingQuest {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setCurrentGame(Game currentGame) {
        VikingQuest.currentGame = currentGame;
    }

    public static void setPlayer(Player player) {
        VikingQuest.player = player;
    }
    
    
    public static void main(String[] args) {
        StartProgram startProgram = new StartProgram();
        startProgram.startProgram();
    
        // the following needs implemented into combatControl.java and wont function yet.
        /*double atk = 1;
        double def = 2;
        int pushTimes= 0;   
        int holdTimes= 3;
        
        double pushOut = QuickSandControl.pushOut(atk,pushTimes );
        
        double holdStill = QuickSandControl.holdStill(def,holdTimes);
        
        if (pushOut==3){
            System.out.println("You have pushed out successfully "+pushOut+" times and escaped.");
        }
        else{
            
        
        System.out.println("You have attempted to pushed out "+pushOut+" times.");
        
        }
        if (holdStill==3){
            System.out.println("You have held still successfully "+holdStill+" times and escaped.");
        }
        else{
            
        
        System.out.println("You have attempted to hold still "+holdStill+" times.");
        
        }*/
    }
}






        
