/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.view;

import java.util.Scanner;

/**
 *
 * @author Nicholas
 */
public abstract class View implements ViewInterface {

    
    private String promptMessage; //Copy and change attribute name
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override //add @Override annotations
    public void display (){
        String value = null;
                        // copy display function
        do { 
            
            System.out.println(this.promptMessage);//display the prompt
        
        } while (!value.equals("Q"));
        
    }
    
    @Override
    public String getInput(){
                                //Copy getInput function
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        //while a valid name has not been retrieved
        while (!valid){
            
            //Prompt for the player's name
            System.out.println("\t\nEnter you selection below:");
        
            //get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length()<1) { //blank value entered
                System.out.println("\n** Invalid selection *** Try again");
                continue;
            }
               
            break;
        }
    
        return selection; //return the name
    }
    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }


    
    
    
}