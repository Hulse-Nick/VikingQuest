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
public class CombatControl {
    
//        public double CombatControl() {
//            if (CombatControl.hitChance(Attacker.atk, Defender.def)){
//                Defender.health - damage();
//                return Defender.health;
//            }
//    }

    public static double hit(double atk, double def){
        double hitChance = (Math.round((Math.random()) * 20)*100)/100 + (atk / 4);
        //return hit > def;
        if (hitChance>def && atk>def){
        double dmg = atk - def;
        return dmg;
        }
        else if(hitChance>def && atk<=def){
        return 1;
        }
        else {
        return 0;
        }
    }
    
}
