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
public class GameplayView {
        private final String GAMEPLAYMENU = "\n"
            +"\n----------------------------------"
            +"\n|       What will you do?        |"
            +"\n----------------------------------"
            +"\nL - Look at your surroundings"
            +"\nN - move North"
            +"\nE - move East"
            +"\nS - move South"
            +"\nW - move West"
            +"\nI - check Inventory"
            +"\nB - consult the Book"
            +"\n----------------------------------"
            +"\n  (dev purposes only: X to leave) ";
    public void displayGameplayMenu() {
        char selection = ' ';
        do {
            System.out.println(GAMEPLAYMENU); //displays menu strings
            
            String input = this.getInput(); //gets what the user typed
            selection = input.charAt(0); //gets first character
            
            this.doAction(selection);
                    }
        while (selection!='X');
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
            case 'L': //new game
                this.look();
                break;
            case 'N': //help
                this.move('N');
                break;
            case 'E': //save
                this.move('E');
                break;
            case 'S': //load
                this.move('S');
                break;
            case 'W': 
                this.move('W');
                break;
            case 'I':
                this.inventory();
                break;
            case 'B':
                this.book();
                break;
            case 'X':
                return;
            default:
                System.out.println("\n *** Invalid selection. Try again");
                break;
        }
        }

    private void look() {
        System.out.println("It looks normal. [<--PLACEHOLDER]"); 
    }

    private void move(char dir) {
        if (dir=='N'){
        System.out.println("*** move(N) function called--you moved North ***");
    }
        if (dir=='E'){
        System.out.println("*** move(E) function called--you moved East ***");
    }
        if (dir=='S'){
        System.out.println("*** move(S) function called--you moved South ***");
    }
        if (dir=='W'){
        System.out.println("*** move(W) function called--you moved West ***");
    }
    }

    private void inventory() {
        System.out.println("*** inventory function called ***");
    }

    private void book() {
        System.out.println("*** book function called ***");
    }
}
