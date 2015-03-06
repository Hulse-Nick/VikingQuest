/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.view;

//import vikingquest.control.QuicksandControl;
import java.util.Scanner;
import vikingquest.control.QuicksandControl;
/**
 *
 * @author Madeleine
 */
public class QuicksandView extends View {
    public QuicksandView() { 
        //why is the menu in here? I'm not being sarcastic, I'm just lost
            super("\n"
        + "\n---------------------------"
        + "\n|        Quicksand        |"
        + "\n---------------------------"
        + "\n|   To escape you may:    |"
        + "\n|                         |"
        + "\n|     H-Hold Still        |"
        + "\n|     P-Pull legs         |"
        + "\n|                         |"
        + "\n|        E-End            |"
        + "\n---------------------------");
    }
    String MENU ="\n"
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
    @Override
    public char doAction (Object obj){
        String value = (String) obj;
        value= value.toUpperCase();// convert to all upper case
        char choice = value.charAt(0);//get first character entered
        return choice;
    }
    
    public void displayQuicksandMenu() {
        char selection;
        double successAttempts=0;
        double failedAttempts=0;
        String failed= "\n Your action failed."+
            "\n3 Failures and you will die.";
    String success= "\nYour action was successful."
            +"\n 3 successes and you will get out.";
    String gotOut= "\n You got out!";
    String died= "\n You died."
            +"\nPlease Try again";
        do{
            System.out.println(MENU); //displays menu strings
            
            String input = this.getQuicksandInput(); //gets what the user typed
            selection = input.charAt(0);
            this.doAction(selection);
            
        if ( QuicksandControl.roll(selection)==true){
                successAttempts +=1;
                System.out.println(success+" You have succeeded "+successAttempts+" time(s)");
            }
        else if ( QuicksandControl.roll(selection)==false) {
                failedAttempts +=1;
                System.out.println(failed+" You have failed "+failedAttempts+" time(s)");
        }
        
        }
        while (selection != 'E' && successAttempts<3 && failedAttempts < 3 );
        
        if (successAttempts >= 3){
                System.out.println(gotOut);
            }
        else if (failedAttempts >= 3){
                System.out.println(died);
            }
        //check the attempts
            
            
        }

    
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

        public void doAction(char selection) {
        switch (selection){
            case 'H': //new game
               // this.quicksand('H');
                break;
            case 'P': //help
                //this.quicksand('P');
                break;
            case 'E': //Exit
                return;
            default:
                System.out.println("\n *** Invalid selection. Try again");
                break;
        }
        }
//private void quicksand(char selection) {
//        boolean roll = QuicksandControl.roll(selection);
//}

   
}
