/**
  *This program asks the user to think of a number b/w 1 and 100 in their head.
  *The computer will then guess a random number b/w 1 and 100.
  *
  *If the comp's guess is smaller than the number, the user types an s.
  *If the guess is bigger than the number, the user types a b.
  *
  *If the guess is correct, the user types a c, at which point the
  *program will print out how many guesses it needed to guess correctly.
  */
 
import java.util.*;
  
 public class Guess
 {
  public static void main (String [] args)
  {
    String temp = " "; //Represents the user inputting s, b or c
  		char answer = ' '; //Converts user's input to a char
  		int guess = 0;     //Represents a random # the comp will guess
  		int lower = 0;     //Lowest number the comp can guess
  		int upper = 0;     //Highest number the comp can guess
  		int count = 0;     //How many guesses are necessary for the com
  			
  		Scanner keyboard = new Scanner (System.in);
  			
  		System.out.print("\n This program has you, the user, choose a number between \n" +
  			 				           "1 and 100. Then I, the computer, will try my best to \n" +
  			 				           "guess it. \n \n" +
  			 				 
  			 				           "If I guess a number that's SMALLER than the \n" +
  			 				           "secret number, respond by typing the letter s. If I \n" +
  			 				           "guess a number that's BIGGER than the secret number, \n" +
  			 				           "respond by typing the letter b. And if I guess \n" +
  			 				           "CORRECTLY, respond by typing the letter c. \n");
  			
  			//While the comp DOESN'T guess correctly, the lines w/in the brackets below will execute
    while (answer != 'c')
  		{
  			 guess = (int) (Math.random() * ((upper - lower) + 1)) + lower;
  				
  				System.out.println("Is it " + guess + "? \t)
  				
  				temp = keyboard.nextLine();
  				answer = temp.toLowerCase().charAt(0);
  				
  				if (answer == 's') lower = guess + 1;  //lower boundary becomes the guess, plus 1
  				else if (answer == 'b') upper = guess - 1; //upper boundary becomes the guess, minus 1
  				/**
  				  *There's no point in including the guessed number in the new boundary, as we know it
  				  * is not correct
  				  */
  				
  				count++; 
  			}
  		 
  		System.out.println();
  		System.out.println("I got it after making " + count + " guesses!");
  } 
  				
}
  
