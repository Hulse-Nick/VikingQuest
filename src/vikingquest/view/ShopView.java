/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.view;

/**
 *
 * @author Nicholas
 */
public class ShopView extends View{
    public ShopView() { 
        //why is the menu in here? I'm not being sarcastic, I'm just lost
            super("\n"
        + "\n---------------------------"
        + "\n|          Shop           |"
        + "\n---------------------------"
        + "\n|         Options         |"
        + "\n|                         |"
        + "\n|         S-Sell          |"
        + "\n|         B-Buy           |"
        + "\n|                         |"
        + "\n|         E-End           |"
        + "\n---------------------------");
    }

    public char doAction(char Selection) {
        boolean value= true;
        while (!value){
            
        char selection = ' ';
        //do {
            ; //displays menu strings
            
            String input = this.getInput(); //gets what the user typed
            selection = input.charAt(0); //gets first character
            
            this.doAction(selection);
                    
        while (selection!='X');
        
       
            switch(selection){
                case 'S': 
                    
                break;
                case 'B': 
                    
                break;
                case 'E': //Exit
                
            default:
                System.out.println("\n *** Invalid selection. Try again");
            }
        
         
        }
        
       //throw new UnsupportedOperationException("Not supported yet.");
        return 'E';
       }

    @Override
    public char doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    }
    
