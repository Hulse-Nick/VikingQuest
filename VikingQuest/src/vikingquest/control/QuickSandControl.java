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
    
    
    public static double pushOut(double atk,double pushTimes){
        
        if (pushTimes>0){
            pushTimes++;
            return pushTimes;
        }
        else if(pushTimes==3) {
            double exceedPushTimes = -1;
            return exceedPushTimes;
        }
        else{
            pushTimes=0;
           return pushTimes; 
        }
        
        
    }
    
        public static double holdStill(double def,double holdTimes){
        
            if (holdTimes>0&&holdTimes<3){
            holdTimes++;
            return holdTimes;
        }
        else if(holdTimes==3) {
            double exceedHoldTimes = -1;
            return exceedHoldTimes;
        }
        else{
            holdTimes=0;
           return holdTimes; 
        }
        
        
    }
}
