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
    
    public String[] equippedList;
//    public Item[] bagItemList;
    public int[] bagItemAtkList;  
    
    public Item dullSword;
    public Item brokenHelm;
    public Item rock;
    public Item raggedPants;
    public Item healPotion;
    
    
    public ItemControl() {
        this.dullSword = new Item();
            dullSword.setAttack(1);
            dullSword.setDefense(0);
            dullSword.setItemType("wpn");
            dullSword.setSpecial(null);
            dullSword.setTitle("Dull Sword");
            dullSword.setUsesLeft(100);
            dullSword.setWeight(2);};
//        String stats = dullSword.toString();
        
    //trying to set the stats of this Item. don't know hy it won't work, but hey. 
//        this.brokenHelm = new Item;
//            this.brokenHelm.setAttack(0);
   
//    public double[] startingBagItems(){
//        bagItemList[0]= dullSword.attack;
//        bagItemList [1]= brokenHelm.attack;
//        bagItemList [2]= rock.attack;
//        bagItemList [3]= raggedPants.attack;
//        bagItemList [4]= healPotion.attack;
//        return bagItemList;
//    }
    
    public int[] startingBagItemAttack(){
        bagItemAtkList [0]= dullSword.getAttack();
        bagItemAtkList [1]= brokenHelm.getAttack();
        bagItemAtkList [2]= rock.getAttack();
        bagItemAtkList [3]= raggedPants.getAttack();
        bagItemAtkList [4]= healPotion.getAttack();
        return bagItemAtkList;
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
    
    public void main(String args[]){ 
    //trying to get the item with the highest attack returned. Bleh.

}
            public int optimizeWeapon(){ 
    int maxValue = bagItemAtkList[0];
    for (int i : bagItemAtkList){
            if (bagItemAtkList[i]>maxValue){
                maxValue = bagItemAtkList[i];
        }
    }
    return maxValue;
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
