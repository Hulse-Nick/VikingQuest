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
public interface ViewInterface {
    
    public void display();
    public String getInput();
    //data types weren't matching between doAction in this class and doAction in QuicksandView--boolean vs. char--I changed this one to fit Quicksand
    public char doAction(Object obj);
    
}
