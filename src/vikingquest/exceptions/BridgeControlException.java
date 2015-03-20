/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.exceptions;

/**
 *
 * @author Madeleine
 */
public class BridgeControlException extends Exception{

    public BridgeControlException() {
    }

    public BridgeControlException(String message) {
        super(message);
    }

    public BridgeControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public BridgeControlException(Throwable cause) {
        super(cause);
    }

    public BridgeControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
