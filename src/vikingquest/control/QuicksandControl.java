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
public class QuicksandControl {
    
    //These variables will be imported from vikingquest.model.Actor
    double totalWeight;
    double attack;
    double defense;
    
    //These variables are local
    double successAttempts;
    double failedAttempts;
    double inputResult;
    double oneToTen;
    String choice;
    String failed= "\n Your action failed."+
            "\n3 Failures and you will die.";
    String success= "\nYour action was successful."
            +"\n 3 successes and you will get out.";
    String gotOut= "\n You got out!";
    String died= "\n You died."
            +"\nPlease Try again";
    double difficulty = 15+1/5 *totalWeight;
    
    public boolean quicksand() {
        do {
            //(Math.round((Math.random()) * 20)*100)/100
//             choice=getQuicksandInput();           
            if("H".equals(choice)){
                inputResult=(Math.round((Math.random()) * 20)*100)/100 +attack/2;
            }
            if ("P".equals(choice)){
              inputResult =(Math.round((Math.random()) * 20)*100)/100 +defense/2;
            }
            if ( inputResult > difficulty){
                successAttempts +=1;
                System.out.println(success);
            }
            if (inputResult <=difficulty) {
                failedAttempts +=1;
                System.out.println(failed);
            }
            
            if (successAttempts ==3){
                System.out.println(gotOut);
                return true;
            }
            else if (failedAttempts ==3){
                System.out.println(died);
                return false;
            }
        
        }
        while ( successAttempts < 3 && failedAttempts < 3);
        this.displayQuicksandMenu();
        return quicksand();
    }
public String QuicksandMenu = "\n"
        + "\n---------------------------"
        + "\n|        Quicksand        |"
        + "\n---------------------------"
        + "\n|   To escape you may:    |"
        + "\n|                         |"
        + "\n|     H-Hold Still        |"
        + "\n|     P-Pull legs         |"
        + "\n|                         |"
        + "\n|        E-End            |"
        + "\n---------------------------";
//
//public String QuicksandHoldStill = "\n"
//        + "\n---------------------------"
//        + "\n|       Quicksand         |"
//        + "\n---------------------------"
//        + "\n|                         |"
//        + "\n|   How many seconds do   |"
//        + "\n|    you hold still?      |"
//        + "\n|                         |"
//        + "\n|   Enter a number(1-9):  |"
//        + "\n|                         |"
//        + "\n|         E-End           |"
//        + "\n---------------------------";

//
//public String QuicksandPullLegs = "\n"
//        + "\n---------------------------"
//        + "\n|       Quicksand         |"
//        + "\n---------------------------"
//        + "\n|                         |"
//        + "\n|  How many times do you  |"
//        + "\n|     pull your Legs?     |"
//        + "\n|                         |"
//        + "\n|   Enter a number(1-9):  |"
//        + "\n|                         |"
//        + "\n|         E-End           |"
//        + "\n----------------------------";
//        
    
    public String getQuicksandInput() {
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
//    public String getQuicksandPullLegs() {
//        boolean valid = false;
//        String playerInput = "";
//        Scanner keyboard = new Scanner(System.in);
//        while(!valid){
//            playerInput = keyboard.nextLine();
//            playerInput = playerInput.trim();
//            //check for validity of entry
//            if (playerInput.length()<1) {
//                System.out.println("Enter a valid value");
//                continue;
//            }
//            break;
//        }
//        
//        return playerInput.toUpperCase();
//    }    
    
    public void displayQuicksandMenu() {
        char selection;
        do{
            System.out.println(QuicksandMenu); //displays menu strings
            
            String input = this.getQuicksandInput(); //gets what the user typed
            selection = input.charAt(0);
            this.doQuicksandChoice(selection);
            }
        while (selection != 'E');
    }
//    public void displayQuicksandHoldStill() {
//        char selection;
//        do{
//         //   System.out.println(QuicksandHoldStill); //displays menu strings
//            
//          //  String input = this.getQuicksandInput(); //gets what the user typed
//           // selection = input.charAt(0);
//            this.quicksand();
//            }
//        while (selection != 'E');
//    }
//    public void displayQuicksandPullLegs() {
//        char selection;
//        do{
//           // System.out.println(QuicksandPullLegs); //displays menu strings
//            
//          //  String input = this.getQuicksandInput(); //gets what the user typed
//          //  selection = input.charAt(0);
//            this.quicksand();
//            }
//        while (selection != 'E');
//    }
    public void doQuicksandChoice(char selection) {
        
        switch (selection){
            case 'H': //Hold Still
                choice= "H";
                quicksand() ;
                break;
            case 'P': //choosen amount
                choice= "P";
                quicksand();
                break;
            case 'E': // close menu
                return;

            default:
                System.out.println("\n *** Invalid selection. Try again");
                break;
        }
    }    
//    public void doQuicksandAmount(char selection) {
//        switch (selection){
//            case '1': //choosen amount
//                oneToTen= 1;
//                this.quicksand();
//                break;
//            case '2': //choosen amount
//                oneToTen= 2;
//                this.quicksand();
//                break;
//            case '3': //choosen amount
//                oneToTen= 3;
//                this.quicksand();
//                break;
//            case '4': //choosen amount
//                oneToTen= 4;
//                this.quicksand();
//                break;
//            case '5': //choosen amount
//                oneToTen= 5;
//                this.quicksand();
//                break;
//            case '6': //choosen amount
//                oneToTen= 6;
//                this.quicksand();
//                break;
//            case '7': //choosen amount
//                oneToTen= 7;
//                this.quicksand();
//                break;
//            case '8': //choosen amount
//                oneToTen= 8;
//                this.quicksand();
//                break;
//            case '9': //choosen amount
//                oneToTen= 9;
//                this.quicksand();
//                break;                
//            case 'E': // close menu
//                return;
//
//            default:
//                System.out.println("\n *** Invalid selection. Try again");
//                break;
//        }
//    }
}
            

