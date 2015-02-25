/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.view;

import java.util.Scanner;
import vikingquest.control.BridgeControl;

/**
 *
 * @author Madeleine
 */
public class BridgeView {
    private final String bridgePuzzleMenu = "\n"
           +"\n-----------------------------------"
           +"\n|How much water will you pour in? |"
           +"\n|                                 |"
           +"\n|   Enter a number                |"
           +"\n|         OR                      |"
           +"\n|   Press 'E' to End              |"
           +"\n-----------------------------------" ;
    public void displayBridgePuzzleMenu() {
        char selection = ' ';
        do {
            System.out.println(bridgePuzzleMenu); //displays menu strings
            
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
            playerInput = keyboard.nextLine();
            playerInput = playerInput.trim();
            //check for validity of entry
            if (playerInput.length()<1|| playerInput.charAt(0)== ' ') {  //|| (playerInput.charAt(0)!= 'N' && playerInput.charAt(0)!= 'H' && playerInput.charAt(0)!= 'S' && playerInput.charAt(0)!= 'L' && playerInput.charAt(0)!= 'E')
                System.out.println("Enter a valid value");
                continue;
            }
            break;
        }
        
        return playerInput;
    }

    private void doAction(char selection) {
        
        double targetDegrees = 28;
        
        double playerDegrees = BridgeControl.bridgeMove(Character.getNumericValue(selection));
        if (playerDegrees<targetDegrees-1){
                System.out.println("Too little. Add more next time");
        } else if(playerDegrees>targetDegrees+1){
                System.out.println("Too much. Add less next time");
        } else {
            System.out.println("The bridge is properly positioned. You can cross now!");
        }
    }
    }

