/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Madeleine
 */
public class BridgeControlTest {
    
    public BridgeControlTest() {
    }

    /**
     * Test of bridgeMove method, of class BridgeControl.
     */
    @Test
    public void testBridgeMove() {
        System.out.println("bridgeMove");
//test case 1
        System.out.println("\n Test case 1");
        double gal1 = 0.0;
        double expResult1 = 0.0;
        double result1 = BridgeControl.bridgeMove(gal1);
        assertEquals(expResult1, result1, 0.0);
        
//test case 2
        System.out.println("\n Test case 2");
        double gal2 = -3;
        double expResult2 = 0;
        double result2 = BridgeControl.bridgeMove(gal2);
        assertEquals(expResult2, result2, 0.0);
//test case 3
        System.out.println("\n Test case 3");
        double gal3 = 50;
        double expResult3 = 0;
        double result3 = BridgeControl.bridgeMove(gal3);
        assertEquals(expResult3, result3, 0.0);
//test case 4
        System.out.println("\n Test case 4");
        double gal4 = 10;
        double expResult4 = 83;
        double result4 = BridgeControl.bridgeMove(gal4);
        assertEquals(expResult4, result4, 0.0);
    }
    
}
