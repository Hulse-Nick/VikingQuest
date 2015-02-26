/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.control;

/**
 *
 * @author Nicholas
 */
public class ItemControl {
    public String[] bagItemList;
    public String[] equippedList;
    
    public void startingBagItems(){
        bagItemList [0]= "Dull Sword";
        bagItemList [1]= "Broken Helm";
        bagItemList [2]= "Rock";
        bagItemList [3]= "Ragged pants";
        bagItemList [4]= "Healing Potion";

    }
    
    
    public void startingGear(){
   //Assigns starting equipped gear.
        equippedList [0]= "Tattered Helm";
        equippedList [1]= "Tattered Breastplate";
        equippedList [2]= "Tattered Pants";
        equippedList [3]= "Tattered Gloves";
        equippedList [4]= "Tattered Boots";
        equippedList [5]= "Tattered Sword";
        equippedList [6]= "Tattered Shield";

    }
    
//    public void displaybatItemList(){
//        String selection;
//        do {
//            System.out.println(equippedList); //displays menu strings
//            
//            String input; 
//        //     input = this.getInput();
//        //     selection = input.substring(0); //gets first character
//            
//        //    this.doAction(selection);
//        }
//        while (selection != "E");
//    }
   
//    public void displayEquippedList(){
//        String selection;
//        do {
//            System.out.println(equippedList); //displays menu strings
//            
//            String input; 
//       //     input = this.getInput();
//       //     selection = input.substring(0); //gets first character
//            
//            this.doAction(selection);
//            }
//        while (selection != "E");
//        }
    



}
