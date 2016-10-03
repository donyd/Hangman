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
public class HangmanHelper {
     /**
     * @param args the command line arguments
     */
    
        
    private final String hangman = "Pineapple Express";
    private int guessCount = 0;
    private int lives = 5;
    
    private String masked;
    private StringBuffer wordMask;
    
    private String revealed;
    private StringBuffer wordRevealed;
    
    public int length = 0;
    private String reveal;
    
    
    // Constructor
    public HangmanHelper(){
        masked = new String();
        reveal = new String();
        wordMask = new StringBuffer();
    }
    
    
    public void askGuess(){
        System.out.println("Enter any letter to guess");
    
    }
    
    
    
    public String getSecretWord(){
        return hangman;
    }
    
    public String checkWord(char userText){
        for (int i = 0; i < hangman.length(); i++){
            if (userText == hangman.charAt(i)){
                wordRevealed.append(hangman.charAt(i));
            }
            revealed = wordRevealed.toString();
        }
        return revealed;
    }
    
    public String toMask(){
        for (int i = 0; i < hangman.length(); i++){
            wordMask.append("*");
        }
        masked = wordMask.toString();
        return masked;
    }
    
    
    public void showResult(){
        System.out.println(masked);
    }
        
    }
    

