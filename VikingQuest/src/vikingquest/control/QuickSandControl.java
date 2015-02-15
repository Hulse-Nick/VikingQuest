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
public class QuickSandControl {
    
    
    public static double pushOut(double atk,int pushTimes){
        
        if (pushTimes==3){
            return pushTimes;
        }
        else if (pushTimes>=0){
            pushTimes++;
            return pushTimes;       
        }
        else{
            pushTimes=0;
           return pushTimes; 
        }
        
        
    }
    
    public static double holdStill(double def,int holdTimes){
        if (holdTimes==3){
            return holdTimes;
        }
        else if (holdTimes>=0){
            holdTimes++;
            return holdTimes;       
        }
        
        else{
            holdTimes=0;
            return holdTimes; 
        }
        
        
    }
}
