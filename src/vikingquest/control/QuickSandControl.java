/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.control;
import java.util.Scanner;
import vikingquest.model.Actor;
/**
 *
 * @author Nicholas
 */
public class QuickSandControl {
    
    
    double totalWeight;
    double attack;
    double defense;
    int successAttempts;
    int failedAttempts;
    double inputResult;
    String choice;

    public QuickSandControl() {
        this.totalWeight = 230;
        this.attack = 10;
        this.defense = 10;
        this.successAttempts = 0;
        this.failedAttempts =0;
    }
    public boolean quickSand() {
        do {
                        
            if("wiggle".equals(choice)){
                //oneToTen*Math.rand *(1.5 *attack);
            }
            if ("hold still".equals(choice)){
            //  inputResult = oneToTen*Math.rand * 1.25*defense;
            }
            if ( inputResult > (2 * totalWeight)){
                failedAttempts +=1;
            }
            if (inputResult >=totalWeight) {
                successAttempts +=1;
            }
            else if (inputResult < totalWeight) {
                failedAttempts +=1;
            }
            if (successAttempts ==3){
                return true;
            }
            else if (failedAttempts ==3){
                return false;
            }
        
        }
        while ( successAttempts < 3 && failedAttempts < 3);
        return quickSand();
    }

        public String getInput() {
        boolean valid = false;
        String playerInput = "";
        Scanner keyboard = new Scanner(System.in);
        while(!valid){
            playerInput = keyboard.nextLine();
            playerInput = playerInput.trim();
            //check for validity of entry
            if (playerInput.length()<1) {
                System.out.println("Enter a valid value");
                continue;
            }
            break;
        }
        
        return playerInput.toUpperCase();
    }
}
            

