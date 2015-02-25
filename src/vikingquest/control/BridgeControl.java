/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.control;

/**
 *
 * @author Madeleine
 */
public class BridgeControl {
 
    public static double bridgeMove(double gal){
        double lbPerGal = 8.345404;
        double degreesMovedPerLb = 1; //this is arbitrary
/*We could put a function here to calculate how much the bridge moves...it'd 
        have to be based on the bridge's weight and length, though...not sure 
        it's worth it. Maybe could just get a random number of degrees per 
        weight every time?*/
        
        double degreesMoved = Math.round((gal*lbPerGal)*degreesMovedPerLb);
//checks for entry errors and changes them to have no effect
        if (degreesMoved>180 || gal<0){
            degreesMoved = 0;
        }
        return degreesMoved;
        
/*we could also either base the entire thing on degrees, or we could have
        it use feet. If we wanted to use feet, it would probably also require
        the bridge's length and the Pythagorean Theorum *shrug* Again, not sure
        it's worth it*/
    }
    
//this is a function to reset the bridge, but I'm not solid on arrays and it might be redundant, so I'll just leave it out for now

//    public static double[] reset(){
//        double gal = 0;
//        double degreesMoved = 0;
//        double[] bridgeSetting = {gal, degreesMoved};
//        return bridgeSetting;
//    }
}
