package vikingquest;
 
import vikingquest.control.QuicksandControl;
import vikingquest.model.Game;
import vikingquest.model.Player;
import vikingquest.view.BridgeView;
import vikingquest.view.GameplayView;
import vikingquest.view.ItemView;
//import vikingquest.view.StartProgram;

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
//        GameplayView game = new GameplayView();
//        game.displayGameplayMenu();

//        ItemView inventory = new ItemView();
//        inventory.displayItemMenu();
        
        QuicksandControl quicksand = new QuicksandControl();
        quicksand.displayQuicksandMenu() ; 
        
//    public static void main(String[] args) {
//        BridgeView firstBridge = new BridgeView();
//        firstBridge.displayBridgePuzzleMenu();
        
 //       StartProgram startProgram = new StartProgram();
 //       startProgram.startProgram();
   

    }
}