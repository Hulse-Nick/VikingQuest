/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.control;

import vikingquest.exceptions.BridgeControlException;

/**
 *
 * @author Madeleine
 */
public class BridgeControl {
 
    public static double bridgeMove(double gal)
        throws BridgeControlException{
        double lbPerGal = 8.345404;
        double degreesMovedPerLb = 1; //this is arbitrary
        
        double degreesMoved = Math.round((gal*lbPerGal)*degreesMovedPerLb);
//checks for entry errors and changes them to have no effect
        if (gal<0){
            throw new BridgeControlException("Enter a valid number."
            );
        }
        else if(degreesMoved>=180){
            throw new BridgeControlException("The bridge swings straight up in the air, then releases the water poured in. Try again.");        
        }
        return degreesMoved;
    }
    }
    
