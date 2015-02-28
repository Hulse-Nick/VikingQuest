/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicholas
 */
public class QuicksandViewTest {
    
    public QuicksandViewTest() {
    }

    /**
     * Test of displayQuicksandMenu method, of class QuicksandView.
     */
    @Test
    public void testDisplayQuicksandMenu() {
        System.out.println("displayQuicksandMenu");
        QuicksandView instance = new QuicksandView();
        instance.displayQuicksandMenu();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getQuicksandInput method, of class QuicksandView.
     */
    @Test
    public void testGetQuicksandInput() {
        System.out.println("getQuicksandInput");
        QuicksandView instance = new QuicksandView();
        String expResult = "";
        String result = instance.getQuicksandInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of doAction method, of class QuicksandView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        char selection = ' ';
        QuicksandView instance = new QuicksandView();
        instance.doAction(selection);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
