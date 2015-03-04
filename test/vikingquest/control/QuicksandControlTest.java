/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.control;

//import vikingquest.control.QuicksandControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicholas
 */
public class QuicksandControlTest {
    
    public QuicksandControlTest() {
    }

    /**
     * Test of roll method, of class QuicksandControl.
     */
    @Test
    public void testRoll() {
        
        System.out.println("roll");
        //test 1
        System.out.println("Testcase 1");
        char selection = 'H';
        boolean expResult = false;
        
        boolean result = QuicksandControl.roll(selection);
        assertEquals(expResult, result);
        //test 2
        System.out.println("Testcase 2");
        char selection2 = 'P';
        boolean expResult2 = true;
        
        boolean result2 = QuicksandControl.roll(selection2);
        assertEquals(expResult2, result2);
        //test 3
        System.out.println("Testcase 3");
        char selection3 = 'h';
        boolean expResult3 = false;
        
        boolean result3 = QuicksandControl.roll(selection3);
        assertEquals(expResult3, result3); 
        //test 4
        System.out.println("Testcase 4");
        char selection4 = 'Q';
        boolean expResult4 = false;
        
        boolean result4 = QuicksandControl.roll(selection4);
        assertEquals(expResult4, result4); 
        
        
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
