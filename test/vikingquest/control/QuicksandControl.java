/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.control;

//import vikingquest.model.Actor;
/**
 *
 * @author Nicholas
 */
public class QuicksandControl {
    

    public static boolean roll(char selection) {
    //These variables will be imported from vikingquest.model.Actor
    double totalWeight=10;
    double attack=20;
    double defense=-20;
    
    //These variables are local
    double difficulty = 10;//15+1/5*totalWeight;
    double inputResult = 0;

    
        //determine whether to use attack or defense
        if (selection == 'H'){
            inputResult=(Math.round((Math.random()) * 20)*100)/100 + (defense/2);
        
        }
        
        else if (selection == 'P'){
            inputResult=(Math.round((Math.random()) * 20)*100)/100 + (attack/2);
        }
        System.out.println(inputResult);
        //return failure or success
        if ( inputResult > difficulty){
            return true;
        } else if ( inputResult <= difficulty){
            return false;
        }
        return false;
    }
}
