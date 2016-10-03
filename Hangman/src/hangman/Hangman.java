/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;
import java.util.Scanner;
/**
 *
 * @author dONY
 */
public class Hangman {
    
    public static void main(String[] args) {
        // Variables
        char userInput;
        String finalReveal;
        
        
        HangmanHelper newGame = new HangmanHelper();
        String secretWord = newGame.getSecretWord();
        
        // Input
        Scanner keyboard = new Scanner(System.in);
        
        
        for (int i = 0; i < secretWord.length(); i++){
        
        System.out.println("Please enter a guess");
        userInput = keyboard.next().charAt(0);
        
         finalReveal = newGame.checkWord(userInput);
        
        }
        
        // Process
        
        
        
        // Output
        newGame.toMask();
        newGame.showResult();
         
    }
    
}
