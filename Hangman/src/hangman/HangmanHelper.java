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
public class HangmanHelper {
     /**
     * @param args the command line arguments
     */
    
        
    private final String hangman = "Pineapple Express";
    private int guessCount = 0;
    private int lives = 5;
    
    private String mask;
    private StringBuffer tempMask;
    
    public int length = 0;
    private String reveal;
    
    
    // Constructor
    public HangmanHelper(){
        mask = new String();
        reveal = new String();
        tempMask = new StringBuffer();
    }
    
    
    
    
    
    public void computeGuess(){
        
    }
    
    public String toMask(){
        for (int i = 0; i < hangman.length(); i++){
            tempMask.append("*");
        }
        mask = tempMask.toString();
        return mask;
    }
    
    
    public void showResult(){
        System.out.println(mask);
    }
        
    }
    

