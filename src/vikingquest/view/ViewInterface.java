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
    //here's where I changed data types
    public char doAction(Object obj);
    
}
