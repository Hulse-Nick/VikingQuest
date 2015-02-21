/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.view;

import java.util.Scanner;

/**
 *
 * @author Madeleine
 */
public class MainMenuView {

    private final String MENU = "\n"
            +"\n--------------------------"
            +"\n|     Main Menu          |"
            +"\n--------------------------"
            +"\nN - Start New Game"
            +"\nH - Help"
            +"\nS - Save Game"
            +"\nL - Load Game"
            +"\nE - Exit"
            +"\n--------------------------";
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); //displays menu strings
            
            String input = this.getInput(); //gets what the user typed
            selection = input.charAt(0); //gets first character
            
            this.doAction(selection);
                    }
        while (selection!='E');
        }

    private String getInput() {
        boolean valid = false;
        String playerInput = " ";
        Scanner keyboard = new Scanner(System.in);
        while(!valid){
            System.out.println("Enter your choice below:");
            playerInput = keyboard.nextLine();
            playerInput = playerInput.trim();
            //check for validity of entry
            if (playerInput.length()<1|| playerInput.length()>1||playerInput.charAt(0)== ' ') {  //|| (playerInput.charAt(0)!= 'N' && playerInput.charAt(0)!= 'H' && playerInput.charAt(0)!= 'S' && playerInput.charAt(0)!= 'L' && playerInput.charAt(0)!= 'E')
                System.out.println("Enter a valid value");
                continue;
            }
            break;
        }
        
        return playerInput.toUpperCase();}

    public void doAction(char selection) {
        switch (selection){
            case 'N': //new game
                this.startNewGame();
                break;
            case 'H': //help
                this.displayHelpMenu();
                break;
            case 'S': //save
                this.saveGame();
                break;
            case 'L': //load
                this.startExistingGame();
                break;
            case 'E': //Exit
                return;
            default:
                System.out.println("\n *** Invalid selection. Try again");
                break;
        }
        }

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***"); 
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    }
