/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Nikola
 */
public class NotEnoughCashException extends Exception{

    public NotEnoughCashException() {
        
    }
    public NotEnoughCashException(String message) {
        super(message);
    }
    
}
