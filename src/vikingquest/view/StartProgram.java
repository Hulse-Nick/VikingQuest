/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.view;

import java.util.Scanner;
import vikingquest.control.ProgramControl;
import vikingquest.model.Player;

/**
 *
 * @author Madeleine
 */
public class StartProgram {
    
    public void startProgram(){
        //display the banner screen
        this.displayBanner();
        //get the player's name
        String playersName = this.getPlayersName();
        //create a new player
        Player player=ProgramControl.createPlayer(playersName);
        //display a custom welcome message
        this.displayWelcomeMessage(player);
        //display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

//display the banner screen
    public void displayBanner() {
        System.out.println("* * * * *"
                        +"\n* Welcome to Viking Quest."
                        +"\n* Your adventure begins on a lone"
                        +"\n* island. In search of treasure, you"
                        +"\n* and your companions have followed the"
                        +"\n* directions within a mystic book, bringing"
                        +"\n* you here. To find the promised treasure"
                        +"\n* you must be clever as well as strong. Many"
                        +"\n* perils and challenges await."
                        +"\n*"
                        +"\n* Be bold of heart and sharp of mind!"
                        +"\n*"
                        +"\n* Claim the treasure!"
                        +"\n*"
                        +"\n* Good luck!"
                        +"\n* * * * *");}

//get the player's name
    public String getPlayersName(){
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        while(!valid){
            System.out.println("Enter your name below:");
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            //check for validity of entry
            if (playersName.length() < 2){
                System.out.println("Name must be at least 2 characters long");
                continue;
            }
            break;
        }
        
        return playersName;
    };

//display a custom welcome message
    public void displayWelcomeMessage(Player player) {
        System.out.println("\n*"
            +"\n* Welcome, " + player.getName() 
            +"\n*");
    }
    }
