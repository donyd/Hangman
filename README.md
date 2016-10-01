# hangman
Hangman application written in Java
Author: Donal D'silva
Date: 1st Oct 2016

Preamble:
This is a repo setup to explore Netbeans and Github. It's primary directive is to serve a dual purpose of exploring git based source control (including various facts of version control branching, merging etc) and also a a collaborative forum with members of the object oriented programming class i'm part of.

As with all endeavours at this point, this will be a iterative by-the-seat-of-my pants effort to learn the ropes in an effort to create a system whereby all my future projects will follow.

##########################################################################
NON-CODING TASKS
##########################################################################
Task# 1
Draw an Input, Process, Output Diagram for the following problem

Task# 2
Draw an object diagram for the same problem

Task# 3



##########################################################################
CODING TASKS
##########################################################################
Task# 1 
Develop an application that allows the user to play a Hangman game.  The game should store a secret word (which you can choose and hard code in to a variable) and allow the user to guess the word one letter at a time.  The game should begin by printing a * for every letter in the word. When the user guesses a letter correctly, that letter should replace the appropriate * and the updated string should be printed to the user.  

For example, if the secret word is house, the application first prints ***** 
and when the user guesses the letter o the output should be *o***.

Task# 2
Write the instantiable class for the problem

Task# 3 
Write the app class for the problem

Task# 4
Add functionality to the app to allow the user to guesss a letter 10 times and give the appropriate output each time

Task# 5
Add further functionality to check if the user has guessed the word completely.  If they have, stop allowing guesses and output a message “Congratulations, you win!”.  If they have not guessed the full word correctly, continue playing the game until they reach 10 guesses.

Task# 6
Give the user an instruction at the start of the game to inform them that they have 5 lives.  Each time they guess a letter which is not present in the word one life is lost.  When all lives have gone, the game should end.

Task# 7
Finally, modify the application so that when the game ends the user is asked would they like to play again. At this point, a new secret word should be chosen and the lives and guesses reset to 5 and 10

