/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.control;

import vikingquest.model.Item;

/**
 *
 * @author Nicholas
 */
public class ItemControl {
    public Item[] bagItemList;
    public String[] equippedList;
  
    
    
    Item dullSword;
public Item brokenHelm = new Item();
    public Item rock = new Item();
    public Item raggedPants = new Item();
    public Item healPotion = new Item();
    
    
    public ItemControl() {
        this.dullSword = new Item();
            dullSword.setAttack(1);
            dullSword.setDefense(0);
            dullSword.setItemType("wpn");
            dullSword.setSpecial(null);
            dullSword.setTitle("Dull Sword");
            dullSword.setUsesLeft(100);
            dullSword.setWeight(2);};
        String stats = dullSword.toString();
   
    public void startingBagItems(){
        bagItemList [0]= dullSword;
        bagItemList [1]= brokenHelm;
        bagItemList [2]= rock;
        bagItemList [3]= raggedPants;
        bagItemList [4]= healPotion;
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
    
    public static void main(String args[]){
    int i;
    
    //was trying to get the names of items to be returned to the view. Bleh.
//    for (i=0;i<bagItemList[].length-1;i++){
//            String name = bagItemList[i].title;
//    }
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
