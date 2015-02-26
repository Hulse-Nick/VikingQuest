/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.view;

import java.util.Scanner;
import vikingquest.control.ItemControl;

/**
 *
 * @author Nicholas
 */
public class ItemView {
    String selectedItem="";
    String selectionType="";
    private final String itemMenu = "\n"
           +"\n-----------------------------------"
           +"\n|      Items in your backpack     |"
           +"\n-----------------------------------"
           +"\n| ITEM              QUANTITY      |"
           +"\n-----------------------------------"
                //add  actual inventory item list 
           +"\n| Dull Sword           1          |"
           +"\n| Broken Helm          2          |"
           +"\n| Rock                 13         |"
           +"\n| Ragged pants         1          |"
           +"\n| Healing Potion       6          |"
                  //end list here
           +"\n|                                 |"
           +"\n-----------------------------------"
           +"\n|      Intentory Options:         |"
           +"\n-----------------------------------"
           +"\n| 'S' - Select an item            |"
           +"\n| 'E' - View Equipped items       |"
           +"\n| 'X' - Close inventory           |"
           +"\n-----------------------------------" ;
//        private final String itemMenu = "\n"

//           +"\n-----------------------------------"
//           +"\n|      Items in your backpack     |"
//           +"\n-----------------------------------"
//           +"\n| ITEM              QUANTITY      |"
//           +"\n-----------------------------------"
    
//           +System.out.println(""+list.get(i).x)
//                //add  actual inventory item list    
//           +"\n|                                 |"
//           +"\n-----------------------------------"
//           +"\n|      Intentory Options:         |"
//           +"\n-----------------------------------"
//           +"\n| 'S' - Select an item            |"
//           +"\n| 'E' - View Equipped items       |"
//           +"\n| 'X' - Close inventory           |"
//           +"\n-----------------------------------" ;
    
    
    private final String equippedItems = "\n"
           +"\n-----------------------------------"
           +"\n|    Item Selection Options:      |"
           +"\n-----------------------------------"
                //add  equipped inventory item list 
           +"\n| Dull Sword           1          |"
           +"\n| Broken Helm          2          |"
           +"\n| Rock                 13         |"
           +"\n| Ragged pants         1          |"
           +"\n| Healing Potion       6          |"
                  //end list here                  |"
           +"\n-----------------------------------" ; 
    
    private final String itemSelection = "\n"
           +"\n-----------------------------------"
           +"\n|    Item Selection Options:      |"
           +"\n-----------------------------------"
           +"\n| 'V' - View item description     |"
           +"\n| 'X' - Return                    |"
           +"\n| 'R' - Remove equipped item      |"
           +"\n| 'U' - Use Item                  |"
           +"\n| 'D' - Drop Item                 |"
           +"\n| 'X' - Return                    |"
           +"\n-----------------------------------" ;
    public void displayItemMenu() {
        char selection;
        do{
            System.out.println(itemMenu); //displays menu strings
            
            String input = this.getInput(); //gets what the user typed
            selection = input.charAt(0); //gets first character
            
            this.doInventoryAction(selection);
            
            }
        while (selection != 'X');
        }
    public void doInventoryAction(char selection) {
        switch (selection){
        case 'S': //Select an item
            displayItemSelection();
            break;
        case 'E': //Select an item
            displayEquippedItems();
            break;
        case 'X': // close menu
            return;

        default:
                System.out.println("\n *** Invalid selection. Try again");
                break;
            }
        }

    public void displayItemSelection() {
        char selection;
        do{
            
            System.out.println(itemSelection); //displays menu strings
            
            String input = this.getInput(); //gets what the user typed
            selection = input.charAt(0); //gets first character
            selectedItem = input;
            this.doItemSelectionAction(selection);
            }
        while (selection != 'X');
        }
    public void displayEquippedItems() {
        char selection;
        do{
            
            System.out.println(equippedItems); //displays menu strings
            
            String input = this.getInput(); //gets what the user typed
            selectedItem = input;
            selection = input.charAt(0);
//            this.doEquippedItemsAction(selection);
            }
        while (selection != 'X');
        }

    public void doItemSelectionAction(char selection) {
            switch (selection){
            case 'V': //Display item description
                
                break;
            case 'R': //unequip
                this.remove('R');
                selectionType = "Unequip";
                confirmation();
                break;
            case 'U': //use item
                this.use();
                selectionType = "Use";
                confirmation();
                break;
            case 'D': //drop item
                this.drop();
                selectionType = "Drop";
                confirmation();
                break;

            case 'X': // close menu
                return;
            default:
                System.out.println("\n *** Invalid selection. Try again");
                break;
            }
        }
    
//    public void doEquippedItemsAction(char selection) {
//            switch (selection){
//            case "V": //Display item description
//                
//                break;
//            case 'R': //unequip
//                this.remove('R');
//                selectionType = "Unequip";
//                confirmation();
//                break;
//            case 'U': //use item
//                this.use();
//                selectionType = "Use";
//                confirmation();
//                break;
//            case 'D': //drop item
//                this.drop();
//                selectionType = "Drop";
//                confirmation();
//                break;
//
//            case 'X': // close menu
//                return;
//            default:
//                System.out.println("\n *** Invalid selection. Try again");
//                break;
//            }
//        }
    
    public void displayItemConfirm() {
        char selection;
        do{
            System.out.println(itemMenu); //displays menu strings
            
            String input = this.getInput(); //gets what the user typed
            selection = input.charAt(0); //gets first character
            
            this.doInventoryAction(selection);
            }
        while (selection != 'X');
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
                if (playerInput.length()<1|| playerInput.length()>1||playerInput.charAt(0)== ' '){  //|| (playerInput.charAt(0)!= 'N' && playerInput.charAt(0)!= 'H' && playerInput.charAt(0)!= 'S' && playerInput.charAt(0)!= 'L' && playerInput.charAt(0)!= 'E')
                    System.out.println("Enter a valid value");
                    continue;
                }
                break;
            }
        
            return playerInput.toUpperCase();
        }        
    
    private void confirmation() {
        System.out.println("\n *** Are you sure you want to "+ selectionType +" "+selectedItem+"? ***");
        
    }
    private void remove(char r) {
        
        
    }

    private void use() {
      
    }

    private void drop() {
     
    }


       
        
   
}
