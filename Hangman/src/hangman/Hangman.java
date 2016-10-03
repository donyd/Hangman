/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author dONY
 */
public class Hangman {
    
    public static void main(String[] args) {
        // Variables
        String userInput;
        
        
        HangmanHelper newGame = new HangmanHelper();
        
        newGame.toMask();
        newGame.showResult();
         
    }
    
}
