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
  			char answer = ' '; //Represents the user typing in s, b, or c
  			int guess = 0;     //Represents a random # the comp will guess
  			
  
