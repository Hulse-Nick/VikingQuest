package vikingquest;


import vikingquest.model.Game;
import vikingquest.model.Item;
import vikingquest.model.Player;
//import vikingquest.view.QuicksandView;
//import vikingquest.view.BridgeView;
//import vikingquest.view.GameplayView;
import vikingquest.view.ItemView;
//import vikingquest.view.StartProgram;

/*
 * import vikingquest.model.Location; import vikingquest.model.Obstacle; import
 * vikingquest.model.Scene; import vikingquest.model.Ship; import
 * vikingquest.model.Actor; import vikingquest.model.Map; import
 * vikingquest.model.NPC; import vikingquest.model.Item;
 *
 *
 * import vikingquest.control.CombatControl; import
 * vikingquest.control.BridgeControl; import
 * vikingquest.control.QuickSandControl; /**
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


        //Trying to create some of the inventory items to try and get arrays happening. BLEH.
        
//        Item dullSword = new Item();
//        dullSword.setAttack(1);
//        dullSword.setDefense(0);
//        dullSword.setItemType("wpn");
//        dullSword.setSpecial(null);
//        dullSword.setTitle("Dull Sword");
//        dullSword.setUsesLeft(100);
//        dullSword.setWeight(2);
//        String stats = dullSword.toString();
//        System.out.println(stats);
//        GameplayView game = new GameplayView();
//        game.displayGameplayMenu();

        ItemView inventory = new ItemView();
        inventory.displayItemMenu();
        
//        QuicksandView quicksand = new QuicksandView();
//        quicksand.displayQuicksandMenu();

//    public static void main(String[] args) {
//        BridgeView firstBridge = new BridgeView();
//        firstBridge.displayBridgePuzzleMenu();
 //       StartProgram startProgram = new StartProgram();
        //       startProgram.startProgram();
    }
}
